/*
 * Copyright (C) 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.healthconnect;

import android.annotation.NonNull;
import android.annotation.SystemApi;
import android.healthconnect.datatypes.DataOrigin;

import java.util.List;
import java.util.Objects;

/** @hide */
@SystemApi
public final class GetDataOriginPriorityOrderResponse {
    private final List<DataOrigin> mDataOriginInPriorityOrder;

    /**
     * @param dataOriginInPriorityOrder dataOrigin in priority order
     * @hide
     */
    public GetDataOriginPriorityOrderResponse(@NonNull List<DataOrigin> dataOriginInPriorityOrder) {
        Objects.requireNonNull(dataOriginInPriorityOrder);

        mDataOriginInPriorityOrder = dataOriginInPriorityOrder;
    }

    /**
     * @return dataOrigin in priority order
     */
    @NonNull
    public List<DataOrigin> getDataOriginInPriorityOrder() {
        return mDataOriginInPriorityOrder;
    }
}
