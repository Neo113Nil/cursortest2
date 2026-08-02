package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.media.MediaCodecInfo;
import android.media.MediaDrmResetException;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class zznv$$ExternalSyntheticApiModelOutline1 {
    public static /* bridge */ /* synthetic */ AudioDeviceInfo m(Object obj) {
        return (AudioDeviceInfo) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ AudioProfile m290m(Object obj) {
        return (AudioProfile) obj;
    }

    public static /* synthetic */ AudioTrack.Builder m() {
        return new AudioTrack.Builder();
    }

    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint m(int i, int i2, int i3) {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(i, i2, i3);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint m291m(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ MediaMetricsManager m292m(Object obj) {
        return (MediaMetricsManager) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ NetworkEvent.Builder m293m() {
        return new NetworkEvent.Builder();
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ PlaybackErrorEvent.Builder m294m() {
        return new PlaybackErrorEvent.Builder();
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ PlaybackMetrics.Builder m295m() {
        return new PlaybackMetrics.Builder();
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ PlaybackStateEvent.Builder m296m() {
        return new PlaybackStateEvent.Builder();
    }

    public static /* synthetic */ TrackChangeEvent.Builder m(int i) {
        return new TrackChangeEvent.Builder(i);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ void m297m() {
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ boolean m299m(Object obj) {
        return obj instanceof MediaDrmResetException;
    }

    public static /* synthetic */ void m$1() {
    }

    public static /* synthetic */ void m$2() {
    }
}
