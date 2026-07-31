package com.sglib.easymobile.androidnative.contacts;

import android.app.Activity;
import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.provider.ContactsContract;
import android.util.Log;
import androidx.core.content.ContextCompat;
import com.safedk.android.utils.Logger;
import com.sglib.easymobile.androidnative.Helper;
import com.unity3d.player.UnityPlayer;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

/* loaded from: classes9.dex */
public class ContactsProvider {
    public static final String PICK_CONTACT_REQUEST_KEY = "PICK_CONTACT_REQUEST_KEY";
    private static final String fetchContactsNullCursorMessage = "Couldn't create cursor to fetch contacts from the device.";
    private static final String nullContentResolverMessage = "Couldn't get content resolver from UnityPlayer's current activity.";
    private static final String permissionDeniedMessage = "Contacts permission hasn't been granted.";
    public static final Dictionary<Integer, IPickContactListener> pickContactCallbacks = new Hashtable();
    private static int pickContactRequestCode = 0;
    private ContentResolver contentResolver = UnityPlayer.currentActivity.getContentResolver();

    public static void safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(Activity p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1);
    }

    public boolean isWriteContactsPermissionGranted() {
        return ContextCompat.checkSelfPermission(UnityPlayer.currentActivity, "android.permission.WRITE_CONTACTS") == 0;
    }

    public boolean isReadContactsPermissionGranted() {
        return ContextCompat.checkSelfPermission(UnityPlayer.currentActivity, "android.permission.READ_CONTACTS") == 0;
    }

    public void getContacts(final IGetAllContactsListener iGetAllContactsListener) {
        if (this.contentResolver == null) {
            iGetAllContactsListener.onGetAllContacts(nullContentResolverMessage, null);
        } else if (!isReadContactsPermissionGranted()) {
            iGetAllContactsListener.onGetAllContacts(permissionDeniedMessage, null);
        } else {
            new Thread(new Runnable() { // from class: com.sglib.easymobile.androidnative.contacts.ContactsProvider.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        ArrayList arrayList = new ArrayList();
                        Cursor query = ContactsProvider.this.contentResolver.query(ContactsContract.Contacts.CONTENT_URI, null, null, null, null);
                        if (query == null) {
                            iGetAllContactsListener.onGetAllContacts(ContactsProvider.fetchContactsNullCursorMessage, null);
                            return;
                        }
                        if (!query.moveToFirst()) {
                            iGetAllContactsListener.onGetAllContacts(null, new Contact[0]);
                            return;
                        }
                        do {
                            String string = query.getString(query.getColumnIndex("_id"));
                            arrayList.add(new Contact(string, ContactsProvider.getContactFirstName(ContactsProvider.this.contentResolver, string), ContactsProvider.getContactMiddleName(ContactsProvider.this.contentResolver, string), ContactsProvider.getContactLastName(ContactsProvider.this.contentResolver, string), ContactsProvider.getContactCompany(ContactsProvider.this.contentResolver, string), ContactsProvider.getContactBirthday(ContactsProvider.this.contentResolver, string), ContactsProvider.getContactPhoneNumbers(query, ContactsProvider.this.contentResolver, string), ContactsProvider.getContactEmails(ContactsProvider.this.contentResolver, string)));
                        } while (query.moveToNext());
                        query.close();
                        iGetAllContactsListener.onGetAllContacts(null, (Contact[]) arrayList.toArray(new Contact[arrayList.size()]));
                    } catch (Exception e) {
                        Helper.Log(Log.getStackTraceString(e));
                        iGetAllContactsListener.onGetAllContacts(e.getMessage(), null);
                    }
                }
            }).start();
        }
    }

    public String addContact(String str, String str2, String str3, String str4, String str5, String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4, String str6) {
        try {
            if (this.contentResolver == null) {
                return nullContentResolverMessage;
            }
            if (!isWriteContactsPermissionGranted()) {
                return permissionDeniedMessage;
            }
            ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
            int size = arrayList.size();
            arrayList.add(getInitializeOperation());
            arrayList.add(getNameOperation(str, str2, str3, size));
            if (str4 != null) {
                arrayList.add(getCompanyOperation(str4, size));
            }
            if (!Helper.IsNullOrEmptyString(str5)) {
                arrayList.add(getBirthdayOperation(str5, size));
            }
            if (strArr2 != null && strArr2.length > 0) {
                for (int i = 0; i < strArr2.length; i++) {
                    arrayList.add(getPhoneNumberOperation(strArr[i], strArr2[i], size));
                }
            }
            if (strArr4 != null && strArr4.length > 0) {
                for (int i2 = 0; i2 < strArr4.length; i2++) {
                    arrayList.add(getEmailOperation(strArr3[i2], strArr4[i2], size));
                }
            }
            if (str6 != null) {
                arrayList.add(getPhotoOperation(Contact.base64StringToByteArray(str6), size));
            }
            this.contentResolver.applyBatch("com.android.contacts", arrayList);
            return null;
        } catch (Exception e) {
            Helper.Log(Log.getStackTraceString(e));
            return e.getMessage();
        }
    }

    public String deleteContact(String str) {
        if (this.contentResolver == null) {
            return nullContentResolverMessage;
        }
        if (!isWriteContactsPermissionGranted()) {
            return permissionDeniedMessage;
        }
        ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
        arrayList.add(getDeleteWithIdOperation(str));
        try {
            this.contentResolver.applyBatch("com.android.contacts", arrayList);
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }

    public void pickContact(IPickContactListener iPickContactListener) {
        if (!isReadContactsPermissionGranted()) {
            if (iPickContactListener != null) {
                iPickContactListener.onNativeContactSelected(permissionDeniedMessage, null);
            }
        } else {
            int i = pickContactRequestCode + 1;
            pickContactRequestCode = i;
            pickContactCallbacks.put(Integer.valueOf(i), iPickContactListener);
            Intent intent = new Intent(UnityPlayer.currentActivity, (Class<?>) PickContactActivity.class);
            intent.putExtra(PICK_CONTACT_REQUEST_KEY, pickContactRequestCode);
            safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(UnityPlayer.currentActivity, intent);
        }
    }

    public static String getContactFirstName(ContentResolver contentResolver, String str) {
        return getContactData(contentResolver, str, "data2", new String[]{"data2"}, new String[]{"vnd.android.cursor.item/name"});
    }

    public static String getContactMiddleName(ContentResolver contentResolver, String str) {
        return getContactData(contentResolver, str, "data5", new String[]{"data5"}, new String[]{"vnd.android.cursor.item/name"});
    }

    public static String getContactLastName(ContentResolver contentResolver, String str) {
        return getContactData(contentResolver, str, "data3", new String[]{"data3"}, new String[]{"vnd.android.cursor.item/name"});
    }

    public static String getContactCompany(ContentResolver contentResolver, String str) {
        return getContactData(contentResolver, str, "data1", new String[]{"data1"}, new String[]{"vnd.android.cursor.item/organization"});
    }

    public static String getContactBirthday(ContentResolver contentResolver, String str) {
        return getContactData(contentResolver, str, "data1", new String[]{"data1"}, new String[]{"vnd.android.cursor.item/contact_event"});
    }

    public static String getContactData(ContentResolver contentResolver, String str, String str2, String[] strArr, String[] strArr2) {
        Cursor query = contentResolver.query(ContactsContract.Data.CONTENT_URI, strArr, "mimetype = ? AND contact_id = " + str, strArr2, null);
        if (query == null || !query.moveToFirst()) {
            return null;
        }
        String string = query.getString(query.getColumnIndex(str2));
        query.close();
        return string;
    }

    public static StringStringPair[] getContactEmails(ContentResolver contentResolver, String str) {
        ArrayList arrayList = new ArrayList();
        Cursor query = contentResolver.query(ContactsContract.CommonDataKinds.Email.CONTENT_URI, null, "contact_id = ?", new String[]{str}, null);
        if (query == null) {
            return new StringStringPair[0];
        }
        while (query.moveToNext()) {
            arrayList.add(new StringStringPair(ContactsContract.CommonDataKinds.Email.getTypeLabel(UnityPlayer.currentActivity.getResources(), query.getInt(query.getColumnIndex("data2")), query.getString(query.getColumnIndex("data3"))).toString(), query.getString(query.getColumnIndex("data1"))));
        }
        query.close();
        return pairListToArray(arrayList);
    }

    public static StringStringPair[] getContactPhoneNumbers(Cursor cursor, ContentResolver contentResolver, String str) {
        ArrayList arrayList = new ArrayList();
        if (cursor.getInt(cursor.getColumnIndex("has_phone_number")) <= 0) {
            return new StringStringPair[0];
        }
        Cursor query = contentResolver.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, "contact_id = ?", new String[]{str}, null);
        if (query == null) {
            return new StringStringPair[0];
        }
        while (query.moveToNext()) {
            arrayList.add(new StringStringPair(ContactsContract.CommonDataKinds.Phone.getTypeLabel(UnityPlayer.currentActivity.getResources(), query.getInt(query.getColumnIndex("data2")), query.getString(query.getColumnIndex("data3"))).toString(), query.getString(query.getColumnIndex("data1"))));
        }
        query.close();
        return pairListToArray(arrayList);
    }

    public static Bitmap getContactPhoto(ContentResolver contentResolver, String str) {
        InputStream openContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, Long.valueOf(str).longValue()));
        if (openContactPhotoInputStream != null) {
            return BitmapFactory.decodeStream(openContactPhotoInputStream);
        }
        return null;
    }

    private ContentProviderOperation getInitializeOperation() {
        return ContentProviderOperation.newInsert(ContactsContract.RawContacts.CONTENT_URI).withValue("account_type", null).withValue("account_name", null).build();
    }

    private ContentProviderOperation getNameOperation(String str, String str2, String str3, int i) {
        ContentProviderOperation.Builder withValue = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", i).withValue("mimetype", "vnd.android.cursor.item/name");
        if (str != null) {
            withValue.withValue("data2", str);
        }
        if (str2 != null) {
            withValue.withValue("data5", str2);
        }
        if (str3 != null) {
            withValue.withValue("data3", str3);
        }
        return withValue.build();
    }

    public ContentProviderOperation getCompanyOperation(String str, int i) {
        return ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", i).withValue("mimetype", "vnd.android.cursor.item/organization").withValue("data1", str).build();
    }

    public ContentProviderOperation getBirthdayOperation(String str, int i) {
        return ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", i).withValue("mimetype", "vnd.android.cursor.item/contact_event").withValue("data2", 3).withValue("data1", str).build();
    }

    private ContentProviderOperation getPhoneNumberOperation(String str, String str2, int i) {
        return ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", i).withValue("mimetype", "vnd.android.cursor.item/phone_v2").withValue("data2", 0).withValue("data3", str).withValue("data1", str2).build();
    }

    private ContentProviderOperation getEmailOperation(String str, String str2, int i) {
        return ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", i).withValue("mimetype", "vnd.android.cursor.item/email_v2").withValue("data2", 0).withValue("data3", str).withValue("data1", str2).build();
    }

    private ContentProviderOperation getPhotoOperation(byte[] bArr, int i) {
        return ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", i).withValue("mimetype", "vnd.android.cursor.item/photo").withValue("data15", bArr).build();
    }

    private ContentProviderOperation getDeleteWithIdOperation(String str) {
        return ContentProviderOperation.newDelete(ContactsContract.RawContacts.CONTENT_URI).withSelection("contact_id = ?", new String[]{str}).build();
    }

    private static StringStringPair[] pairListToArray(List<StringStringPair> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return new StringStringPair[0];
        }
        return (StringStringPair[]) list.toArray(new StringStringPair[list.size()]);
    }
}
