package com.monetization.ads.exo.source.dash;

import android.net.Uri;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import yads.dc2;
import yads.s30;
import yads.sb3;

/* loaded from: classes4.dex */
public final class h implements dc2 {
    @Override // yads.dc2
    public final Object a(Uri uri, s30 s30Var) {
        return Long.valueOf(sb3.f(new BufferedReader(new InputStreamReader(s30Var)).readLine()));
    }
}
