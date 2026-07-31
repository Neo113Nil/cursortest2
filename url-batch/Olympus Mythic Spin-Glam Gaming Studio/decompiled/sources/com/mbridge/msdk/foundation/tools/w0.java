package com.mbridge.msdk.foundation.tools;

import com.google.android.exoplayer2.C;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* compiled from: SerializeTools.java */
/* loaded from: classes10.dex */
public class w0 {
    public static String a(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(obj);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            objectOutputStream.flush();
            objectOutputStream.close();
            return new String(byteArray, C.ISO88591_NAME);
        } catch (IOException e) {
            q0.b("SerializeTools", "IOException", e);
            return "";
        }
    }

    public static Object a(String str) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes(C.ISO88591_NAME));
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            Object readObject = objectInputStream.readObject();
            objectInputStream.close();
            byteArrayInputStream.close();
            return readObject;
        } catch (Exception e) {
            q0.b("SerializeTools", "Exception", e);
            return null;
        }
    }
}
