/**
 * Copyright 2017 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.braunster.chatsdk.activities.location;

import android.content.Intent;
import android.util.Log;

import com.braunster.chatsdk.activities.FirstMainActivity;
import com.google.android.gms.gcm.GcmNetworkManager;
import com.google.android.gms.gcm.GcmTaskService;
import com.google.android.gms.gcm.TaskParams;

public class TrackerTaskService extends GcmTaskService {

    public static final String TAG = TrackerTaskService.class.getSimpleName();

    @Override
    public int onRunTask(TaskParams taskParams) {
        Log.i(TAG, "onRunTask");
        Intent start = new Intent(this, FirstMainActivity.class);
        start.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(start);
        return GcmNetworkManager.RESULT_SUCCESS;
    }

}
