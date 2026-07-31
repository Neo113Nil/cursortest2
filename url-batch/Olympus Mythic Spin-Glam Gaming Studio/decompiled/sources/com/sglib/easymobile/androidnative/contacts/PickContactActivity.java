package com.sglib.easymobile.androidnative.contacts;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import androidx.annotation.Nullable;
import com.safedk.android.utils.Logger;
import com.sglib.easymobile.androidnative.Helper;

/* loaded from: classes5.dex */
public class PickContactActivity extends Activity {
    public static final int PICK_CONTACT = 101;
    private static final String selectedContactNullMessage = "Couldn't get selected contact from cursor.";
    private static final String userCanceledMessage = "Progress has been canceled by user.";
    private IPickContactListener callback;

    public static void safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(Activity p0, Intent p1, int p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p1 == null) {
            return;
        }
        p0.startActivityForResult(p1, p2);
    }

    @Override // android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.callback = ContactsProvider.pickContactCallbacks.get(Integer.valueOf(getIntent().getIntExtra(ContactsProvider.PICK_CONTACT_REQUEST_KEY, 0)));
        safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(this, new Intent("android.intent.action.PICK", ContactsContract.Contacts.CONTENT_URI), 101);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006c A[Catch: all -> 0x0065, Exception -> 0x0067, TryCatch #1 {Exception -> 0x0067, blocks: (B:24:0x002e, B:26:0x0034, B:19:0x006c, B:22:0x0074), top: B:23:0x002e, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0074 A[Catch: all -> 0x0065, Exception -> 0x0067, TRY_LEAVE, TryCatch #1 {Exception -> 0x0067, blocks: (B:24:0x002e, B:26:0x0034, B:19:0x006c, B:22:0x0074), top: B:23:0x002e, outer: #0 }] */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onActivityResult(int i, int i2, Intent intent) {
        Contact contact;
        IPickContactListener iPickContactListener = this.callback;
        if (iPickContactListener == null) {
            finish();
            return;
        }
        if (i == 101) {
            if (i2 == 0) {
                iPickContactListener.onNativeContactSelected(userCanceledMessage, null);
                finish();
                return;
            }
            if (i2 == -1) {
                Uri data = intent.getData();
                ContentResolver contentResolver = getContentResolver();
                Cursor query = contentResolver.query(data, null, null, null, null);
                try {
                    if (query != null) {
                        try {
                        } catch (Exception e) {
                            Helper.Log(Log.getStackTraceString(e));
                            this.callback.onNativeContactSelected(e.getMessage(), null);
                        }
                        if (query.moveToFirst()) {
                            String string = query.getString(query.getColumnIndex("_id"));
                            contact = new Contact(string, ContactsProvider.getContactFirstName(contentResolver, string), ContactsProvider.getContactMiddleName(contentResolver, string), ContactsProvider.getContactLastName(contentResolver, string), ContactsProvider.getContactCompany(contentResolver, string), ContactsProvider.getContactBirthday(contentResolver, string), ContactsProvider.getContactPhoneNumbers(query, contentResolver, string), ContactsProvider.getContactEmails(contentResolver, string), ContactsProvider.getContactPhoto(contentResolver, string));
                            if (contact != null) {
                                this.callback.onNativeContactSelected(selectedContactNullMessage, null);
                            } else {
                                this.callback.onNativeContactSelected(null, contact);
                            }
                            finish();
                            query.close();
                        }
                    }
                    contact = null;
                    if (contact != null) {
                    }
                    finish();
                    query.close();
                } catch (Throwable th) {
                    finish();
                    query.close();
                    throw th;
                }
            }
        }
    }
}
