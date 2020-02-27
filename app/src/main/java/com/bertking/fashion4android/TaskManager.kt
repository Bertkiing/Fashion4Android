package com.bertking.fashion4android

import java.util.concurrent.BlockingQueue
import java.util.concurrent.LinkedBlockingQueue
import java.util.concurrent.ThreadPoolExecutor
import java.util.concurrent.TimeUnit

/**
 * @Author: Bertking
 * @Date：2018/12/28-8:16 PM
 * @Description:
 * @link https://developer.android.com/training/multiple-threads/create-threadpool#kotlin
 */
object TaskManager {
    /**
     * Gets the number of available cores
     * (not always the same as the maximum number of cores)
     *
     * availableProcessors()
     *  returns the number of active cores, which may be less than the total number of cores.
     */
    private val NUMBER_OF_CORES = Runtime.getRuntime().availableProcessors()

    // Sets the amount of time an idle thread waits before terminating
    private const val KEEP_ALIVE_TIME = 1L
    // Sets the Time Unit to seconds
    private val KEEP_ALIVE_TIME_UNIT = TimeUnit.SECONDS

    // Instantiates the queue of Runnables as a LinkedBlockingQueue
    private val mDecodeWorkQueue: BlockingQueue<Runnable> = LinkedBlockingQueue<Runnable>()

    // Creates a thread pool manager
    private val mDecodeThreadPool: ThreadPoolExecutor = ThreadPoolExecutor(
        NUMBER_OF_CORES,       // Initial pool size
        NUMBER_OF_CORES,       // Max pool size
        KEEP_ALIVE_TIME,
        KEEP_ALIVE_TIME_UNIT,
        mDecodeWorkQueue
    )


}