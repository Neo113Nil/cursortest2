package com.facebook.ads.redexgen.core;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;

/* renamed from: com.facebook.ads.redexgen.X.gA, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public interface InterfaceC3184gA {
    boolean ADs(C3182g8 c3182g8);

    HttpURLConnection AGl(String str, Proxy proxy) throws IOException;

    InputStream AGm(HttpURLConnection httpURLConnection) throws IOException;

    OutputStream AGn(HttpURLConnection httpURLConnection) throws IOException;

    void AH6(HttpURLConnection httpURLConnection, EnumC3180g6 enumC3180g6, String str) throws IOException;

    byte[] AHT(InputStream inputStream) throws IOException;

    void AL8(OutputStream outputStream, byte[] bArr) throws IOException;
}
