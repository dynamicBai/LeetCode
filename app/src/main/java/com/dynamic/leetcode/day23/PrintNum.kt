package com.dynamic.leetcode.day23

import android.util.Log

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/29
 * 两个线程交替打印奇偶数
 */
object PrintNum {
    fun printNum() {
        val obj = Obj()
        val t1 = Thread(Even(obj))
        val t2 = Thread(Odd(obj))
        t1.start()
        t2.start()
    }

    class Obj : Object() {
        var num: Int = 0
    }

    class Odd(private val obj: Obj) : Runnable {
        override fun run() {
            while (obj.num < 100) {
                synchronized(obj) {
                    if (obj.num % 2 != 0) {
                        try {
                            obj.wait()
                        } catch (e: Exception) {
                        }
                    } else {
                        Log.d("PrintNum", "PrintNum: ${obj.num} ----->thread odd")
                        obj.num++
                        obj.notify()
                    }
                }
            }
        }
    }

    class Even(private val obj: Obj) : Runnable {
        override fun run() {
            while (obj.num < 100) {
                synchronized(obj) {
                    if (obj.num % 2 != 1) {
                        try {
                            obj.wait()
                        } catch (e: Exception) {
                        }
                    } else {
                        Log.d("PrintNum", "PrintNum: ${obj.num} ----->thread  even")
                        obj.num++
                        obj.notify()
                    }
                }

            }
        }
    }

    fun test() {
        printNum()
    }

}