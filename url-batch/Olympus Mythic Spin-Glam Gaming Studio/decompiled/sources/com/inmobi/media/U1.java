package com.inmobi.media;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import androidx.media3.exoplayer.AudioFocusManager$$ExternalSyntheticApiModelOutline6;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class U1 {
    public final Context a;
    public boolean b;
    public WeakReference c;
    public final AudioAttributes d;
    public AudioFocusRequest e;
    public AudioManager.OnAudioFocusChangeListener f;

    public U1(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.a = applicationContext;
        AudioAttributes build = new AudioAttributes.Builder().setUsage(1).setContentType(2).setLegacyStreamType(3).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        this.d = build;
    }

    public final void a() {
        this.b = false;
        try {
            Object systemService = this.a.getSystemService("audio");
            AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
            if (audioManager != null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    AudioFocusRequest audioFocusRequest = this.e;
                    if (audioFocusRequest != null) {
                        audioManager.abandonAudioFocusRequest(audioFocusRequest);
                        return;
                    }
                    return;
                }
                AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.f;
                if (onAudioFocusChangeListener != null) {
                    audioManager.abandonAudioFocus(onAudioFocusChangeListener);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final AudioManager.OnAudioFocusChangeListener b() {
        return new AudioManager.OnAudioFocusChangeListener() { // from class: com.inmobi.media.U1$$ExternalSyntheticLambda0
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i) {
                U1.a(U1.this, i);
            }
        };
    }

    public final AudioFocusRequest c() {
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest.Builder onAudioFocusChangeListener;
        AudioFocusRequest build;
        audioAttributes = AudioFocusManager$$ExternalSyntheticApiModelOutline6.m(2).setAudioAttributes(this.d);
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener2 = this.f;
        Intrinsics.checkNotNull(onAudioFocusChangeListener2);
        onAudioFocusChangeListener = audioAttributes.setOnAudioFocusChangeListener(onAudioFocusChangeListener2, ((ExecutorC4101jc) AbstractC4437w6.e.getValue()).a);
        build = onAudioFocusChangeListener.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    public final void d() {
        WeakReference weakReference = this.c;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.c = null;
        a();
        if (Build.VERSION.SDK_INT >= 26) {
            this.e = null;
        }
        this.f = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e() {
        AudioManager audioManager;
        int i;
        try {
            Object systemService = this.a.getSystemService("audio");
            audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        } catch (Throwable unused) {
        }
        if (audioManager != null) {
            if (this.f == null) {
                this.f = b();
            }
            if (Build.VERSION.SDK_INT >= 26) {
                if (this.e == null) {
                    this.e = c();
                }
                AudioFocusRequest audioFocusRequest = this.e;
                if (audioFocusRequest != null) {
                    i = audioManager.requestAudioFocus(audioFocusRequest);
                }
            } else {
                i = audioManager.requestAudioFocus(this.f, 3, 2);
            }
            return i != 1;
        }
        i = 0;
        if (i != 1) {
        }
    }

    public static final void a(U1 u1, int i) {
        T1 t1;
        T1 t12;
        WeakReference weakReference;
        T1 t13;
        if (i == -2) {
            u1.b = true;
            WeakReference weakReference2 = u1.c;
            if (weakReference2 == null || (t1 = (T1) weakReference2.get()) == null) {
                return;
            }
            t1.a();
            return;
        }
        if (i == -1) {
            u1.b = false;
            WeakReference weakReference3 = u1.c;
            if (weakReference3 == null || (t12 = (T1) weakReference3.get()) == null) {
                return;
            }
            t12.a();
            return;
        }
        if (i != 1) {
            return;
        }
        if (u1.b && (weakReference = u1.c) != null && (t13 = (T1) weakReference.get()) != null) {
            t13.b();
        }
        u1.b = false;
    }
}
