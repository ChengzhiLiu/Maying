package co.tgbot.peekfun.network.ssrsub


/**
 * Created by vay on 2018/07/19
 */
open class SubUpdateCallback {

    /**
     * success
     */
    open fun onSuccess(subname:String) {}

    /**
     * failed
     */
    open fun onFailed() {}

    /**
     * finished
     */
    open fun onFinished() {}
}
