/**
 * Copyright (C) 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * ```
 *      http://www.apache.org/licenses/LICENSE-2.0
 * ```
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.android.healthconnect.controller.shared

import android.content.Context
import android.content.pm.ApplicationInfo
import android.graphics.drawable.Drawable
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class AppInfoReader @Inject constructor(@ApplicationContext private val context: Context) {

    private val cache = HashMap<String, String>()

    // TODO(magdi) replace this with health connect framework api
    private val packageManager = context.packageManager

    fun getAppName(packageName: String): String {
        if (cache.containsKey(packageName)) {
            return cache[packageName]!!
        }
        return packageManager.getApplicationLabel(getPackageInfo(packageName)).toString()
    }

    fun getAppIcon(packageName: String): Drawable? {
        return packageManager.getApplicationIcon(packageName)
    }

    private fun getPackageInfo(packageName: String): ApplicationInfo {
        return packageManager.getApplicationInfo(packageName, 0 /* flags */)
    }
}
