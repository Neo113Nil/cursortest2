package com.sglib.easymobile.androidnative.media;

import android.app.Activity;
import android.content.ClipData;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.safedk.android.utils.Logger;
import com.sglib.easymobile.androidnative.media.listeners.IPickFromGalleryListener;
import com.unity3d.player.UnityPlayer;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public class GalleryActivity extends Activity {
    static final int REQUEST_GALLERY = 201;
    private IPickFromGalleryListener mPickImageResponseInterface;

    public static void safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(Activity p0, Intent p1, int p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p1 == null) {
            return;
        }
        p0.startActivityForResult(p1, p2);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mPickImageResponseInterface = DeviceGallery.PickImgFromGalleryListeners.get(getIntent().getStringExtra(DeviceGallery.EXTRA_RESPONSE_KEY));
        boolean booleanExtra = getIntent().getBooleanExtra(DeviceGallery.EXTRA_ALLOW_MULTI_SELECT_KEY, false);
        Intent intent = new Intent();
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", booleanExtra);
        intent.setType("image/*");
        intent.setAction("android.intent.action.GET_CONTENT");
        safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(this, Intent.createChooser(intent, "Select Picture"), 201);
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        if (i == 201) {
            if (i2 == -1) {
                String[] strArr = {"_data"};
                ArrayList arrayList = new ArrayList();
                if (intent.getData() == null) {
                    if (intent.getClipData() != null) {
                        ClipData clipData = intent.getClipData();
                        for (int i3 = 0; i3 < clipData.getItemCount(); i3++) {
                            Uri uri = clipData.getItemAt(i3).getUri();
                            arrayList.add(uri);
                            Cursor query = getContentResolver().query(uri, strArr, null, null, null);
                            if (query != null) {
                                query.moveToFirst();
                                query.close();
                            }
                        }
                        Log.v("NativeAndroid", "Selected Images" + arrayList.size());
                    }
                } else {
                    Uri data = intent.getData();
                    if (data != null) {
                        arrayList.add(data);
                        Cursor query2 = getContentResolver().query(data, strArr, null, null, null);
                        if (query2 != null) {
                            query2.moveToFirst();
                            query2.close();
                        }
                    }
                }
                MediaResult[] mediaResultArr = new MediaResult[arrayList.size()];
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    String realPath = Utilities.getRealPath(this, (Uri) arrayList.get(i4));
                    grantUriPermission(UnityPlayer.currentActivity.getPackageName(), (Uri) arrayList.get(i4), 1);
                    mediaResultArr[i4] = new MediaResult(MediaType.Image, ((Uri) arrayList.get(i4)).toString(), realPath);
                }
                this.mPickImageResponseInterface.OnNativeItemPicked(null, mediaResultArr);
            } else {
                this.mPickImageResponseInterface.OnNativeItemPicked("Fail to select picture.", null);
            }
            finish();
        }
    }
}
