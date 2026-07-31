package com.sglib.easymobile.androidnative.contacts;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import com.unity3d.player.UnityPlayer;
import java.io.ByteArrayOutputStream;

/* loaded from: classes5.dex */
public class Contact {
    private String birthdayString;
    private String company;
    private StringStringPair[] emails;
    private String firstName;
    private String id;
    private String lastName;
    private String middleName;
    private StringStringPair[] phoneNumbers;
    private Bitmap photo;

    public Contact(String str, String str2, String str3, String str4, String str5, String str6, StringStringPair[] stringStringPairArr, StringStringPair[] stringStringPairArr2) {
        this.id = str;
        this.firstName = str2;
        this.middleName = str3;
        this.lastName = str4;
        this.company = str5;
        this.birthdayString = str6;
        this.phoneNumbers = stringStringPairArr;
        this.emails = stringStringPairArr2;
    }

    public Contact(String str, String str2, String str3, String str4, String str5, String str6, StringStringPair[] stringStringPairArr, StringStringPair[] stringStringPairArr2, Bitmap bitmap) {
        this(str, str2, str3, str4, str5, str6, stringStringPairArr, stringStringPairArr2);
        this.photo = bitmap;
    }

    public Contact(String str, String str2, String str3, String str4, String str5, String str6, StringStringPair[] stringStringPairArr, StringStringPair[] stringStringPairArr2, String str7) {
        this(str, str2, str3, str4, str5, str6, stringStringPairArr, stringStringPairArr2, base64StringToBitmap(str7));
    }

    public String getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getCompany() {
        return this.company;
    }

    public String getBirthdayString() {
        return this.birthdayString;
    }

    public StringStringPair[] getPhoneNumbers() {
        return this.phoneNumbers;
    }

    public StringStringPair[] getEmails() {
        return this.emails;
    }

    public String getPhotoAsBase64String() {
        if (this.photo == null) {
            this.photo = ContactsProvider.getContactPhoto(UnityPlayer.currentActivity.getContentResolver(), getId());
        }
        Bitmap bitmap = this.photo;
        if (bitmap == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
    }

    public byte[] getPhotoAsByteArray() {
        if (this.photo == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.photo.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static Bitmap base64StringToBitmap(String str) {
        byte[] base64StringToByteArray = base64StringToByteArray(str);
        if (base64StringToByteArray == null) {
            return null;
        }
        return BitmapFactory.decodeByteArray(base64StringToByteArray, 0, base64StringToByteArray.length);
    }

    public static byte[] base64StringToByteArray(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }
}
