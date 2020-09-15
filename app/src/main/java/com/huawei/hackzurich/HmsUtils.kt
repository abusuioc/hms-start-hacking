package com.huawei.hackzurich

import android.content.Context
import com.huawei.agconnect.config.AGConnectServicesConfig
import com.huawei.hms.aaid.HmsInstanceId
import com.huawei.hms.api.ConnectionResult
import com.huawei.hms.api.HuaweiApiAvailability


object HmsUtils {

    fun isHmsAvailable(context: Context): Boolean =
        HuaweiApiAvailability.getInstance()
            .isHuaweiMobileServicesAvailable(context) == ConnectionResult.SUCCESS

    fun getPushNotificationsToken(context: Context): String {
        val appId = AGConnectServicesConfig.fromContext(context).getString("client/app_id")
        return HmsInstanceId.getInstance(context).getToken(appId, "HCM")
    }
}