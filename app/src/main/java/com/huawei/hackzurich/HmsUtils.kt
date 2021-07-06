package com.huawei.hackzurich

import android.content.Context
import com.huawei.agconnect.AGConnectInstance
import com.huawei.hms.aaid.HmsInstanceId
import com.huawei.hms.api.ConnectionResult
import com.huawei.hms.api.HuaweiApiAvailability


object HmsUtils {

    fun isHmsAvailable(context: Context): Boolean =
        HuaweiApiAvailability.getInstance()
            .isHuaweiMobileServicesAvailable(context) == ConnectionResult.SUCCESS

    fun getPushNotificationsToken(context: Context): String {
        val appId = AGConnectInstance.getInstance().options.getString("client/app_id ")
        return HmsInstanceId.getInstance(context).getToken(appId, "HCM")
    }
}