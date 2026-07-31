package com.safedk.android.analytics.brandsafety;

import android.graphics.Bitmap;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.safedk.android.SafeDK;
import com.safedk.android.a.g;
import com.safedk.android.analytics.AppLovinBridge;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.safedk.android.utils.Logger;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes12.dex */
public final class x {
    private static final String a = "VideoFrameManager";
    private static x b = null;
    private static final String d = "video/";
    private static final int e = 2000000;
    private static final String f = "ve";
    private static final String g = "vurl";
    private static final String h = "sam";
    private static final String i = "ft";
    private static final String j = "tt";
    private static final String k = "w";
    private static final String l = "h";
    private static final String m = "cq";
    private static final String n = "siok";
    private static final String o = "rp";
    private static final String p = "sz";
    private static final String q = "iurl";
    private static final String r = "key_prefix";
    private static final String s = "key";
    private static final String t = "gcs_params";
    private static final String u = "headers";
    private static final String v = "upload_url";
    private final ScheduledExecutorService c = Executors.newScheduledThreadPool(1);

    private x() {
        b();
    }

    public static x a() {
        if (b == null) {
            b = new x();
        }
        return b;
    }

    private void b() {
        AppLovinBridge.registerListener(AppLovinBridge.b, new com.safedk.android.analytics.b() { // from class: com.safedk.android.analytics.brandsafety.x.1
            @Override // com.safedk.android.analytics.b
            public void a(String str, final Bundle bundle) {
                Logger.d(x.a, "response received");
                x.this.c.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.x.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (bundle.containsKey(x.f)) {
                            new File(SafeDK.getInstance().ah()).mkdirs();
                            x.b(bundle, false, "");
                            x.b(new File(SafeDK.getInstance().af()));
                        }
                    }
                });
            }
        });
    }

    public void a(final String str, final String str2) {
        this.c.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.x.2
            @Override // java.lang.Runnable
            public void run() {
                new File(SafeDK.getInstance().ah()).mkdirs();
                Bundle b2 = x.b(str);
                Logger.d(x.a, "shake menu simulation - start date= ", new Date(System.currentTimeMillis()));
                x.b(b2, true, str2);
                Logger.d(x.a, "shake menu simulation - end date= ", new Date(System.currentTimeMillis()));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bundle b(String str) {
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        bundle.putBundle(f, bundle2);
        bundle2.putString(g, str);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        arrayList.add(a(0.0d, -1.0d, 667, 667, 0.8d, false));
        bundle2.putParcelableArrayList(h, arrayList);
        return bundle;
    }

    private static Bundle a(double d2, double d3, int i2, int i3, double d4, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putDouble(i, d2);
        bundle.putDouble("tt", d3);
        bundle.putInt("w", i2);
        bundle.putInt("h", i3);
        bundle.putDouble(m, d4);
        bundle.putBoolean(n, z);
        bundle.putBundle(o, new Bundle());
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01d7, code lost:
    
        com.safedk.android.utils.Logger.d(com.safedk.android.analytics.brandsafety.x.a, "handle stats reported response - stop if okay set to true. stopping process, discard next frames.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(Bundle bundle, boolean z, String str) {
        MediaExtractor mediaExtractor;
        MediaExtractor mediaExtractor2;
        int i2 = 2;
        char c = 0;
        Logger.printFullVerboseLog(a, "handle stats reported response - response body= ", bundle);
        Bundle bundle2 = bundle.getBundle(f);
        if (bundle2 == null) {
            return;
        }
        String string = bundle2.getString(g);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        File a2 = j.a(string, SafeDK.getInstance().ag(), str + "videoFrame.mp4");
        Logger.d(a, "handle stats reported response - video file= ", a2);
        if (a2 == null) {
            return;
        }
        try {
            MediaExtractor mediaExtractor3 = new MediaExtractor();
            try {
                mediaExtractor3.setDataSource(a2.getAbsolutePath());
                int a3 = a(mediaExtractor3);
                try {
                    if (a3 < 0) {
                        Logger.d(a, "handle stats reported response - could not find video track, returning");
                        Logger.d(a, "handle stats reported response - releasing extractor");
                        c(mediaExtractor3);
                        return;
                    }
                    mediaExtractor3.selectTrack(a3);
                    mediaExtractor3.seekTo(0L, 2);
                    MediaMetadataRetriever c2 = c(a2);
                    if (c2 == null) {
                        Logger.d(a, "handle stats reported response - could not initialize media metadata retriever, returning");
                        Logger.d(a, "handle stats reported response - releasing extractor");
                        c(mediaExtractor3);
                        return;
                    }
                    Iterator it = bundle2.getParcelableArrayList(h).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            mediaExtractor2 = mediaExtractor3;
                            break;
                        }
                        Bundle bundle3 = (Bundle) it.next();
                        double d2 = bundle3.getDouble(i);
                        long a4 = a(d2);
                        long a5 = a(bundle3.getDouble("tt"));
                        int i3 = bundle3.getInt("w");
                        int i4 = bundle3.getInt("h");
                        double d3 = bundle3.getDouble(m);
                        boolean z2 = bundle3.getBoolean(n);
                        Bundle bundle4 = bundle3.getBundle(o);
                        long a6 = a(mediaExtractor3, a4);
                        Object[] objArr = new Object[i2];
                        objArr[c] = "handle stats reported response - cosest key frame time found= ";
                        objArr[1] = Long.valueOf(a6);
                        Logger.d(a, objArr);
                        long abs = Math.abs(a4 - a6);
                        if (a5 < 0 || abs <= a5) {
                            Bitmap a7 = a(c2, a4);
                            if (a7 == null) {
                                Object[] objArr2 = new Object[1];
                                objArr2[c] = "handle stats reported response - could not get frame bitmap, continue to next frame";
                                Logger.d(a, objArr2);
                            } else {
                                BrandSafetyUtils.ScreenshotValidity a8 = BrandSafetyUtils.a((String) null, BrandSafetyUtils.a((String) null, a7));
                                if (a8 != BrandSafetyUtils.ScreenshotValidity.VALID) {
                                    Logger.d(a, "handle stats reported response - frame is not uniform, continue to next frame. frame validity= ", a8.toString());
                                    i2 = 2;
                                    c = 0;
                                } else {
                                    Bitmap a9 = a(a7, i3, i4);
                                    if (a9 == null) {
                                        Logger.d(a, "handle stats reported response - could not scale bitmap, continue to next frame");
                                        i2 = 2;
                                        c = 0;
                                    } else {
                                        String a10 = a(a4, str);
                                        BrandSafetyUtils.a(a9, a10, (int) Math.round(d3 * 100.0d));
                                        if (z) {
                                            Logger.d(a, "handle stats reported response - it's a shake menu simulation, continue to next frame.");
                                            i2 = 2;
                                            c = 0;
                                        } else {
                                            MediaMetadataRetriever mediaMetadataRetriever = c2;
                                            mediaExtractor2 = mediaExtractor3;
                                            try {
                                                Bundle a11 = a(a10, string, bundle4, d2, a9.getWidth(), a9.getHeight());
                                                Logger.d(a, "handle stats reported response - bundle to report ", a11);
                                                if (a11 != null) {
                                                    a(a10, bundle3, a11);
                                                }
                                                if (z2) {
                                                    break;
                                                }
                                                mediaExtractor3 = mediaExtractor2;
                                                c2 = mediaMetadataRetriever;
                                                i2 = 2;
                                                c = 0;
                                            } catch (Exception e2) {
                                                e = e2;
                                                mediaExtractor = mediaExtractor2;
                                                try {
                                                    Logger.d(a, "handle stats reported response - exception= ", e);
                                                    Logger.d(a, "handle stats reported response - releasing extractor");
                                                    c(mediaExtractor);
                                                } catch (Throwable th) {
                                                    th = th;
                                                    Logger.d(a, "handle stats reported response - releasing extractor");
                                                    c(mediaExtractor);
                                                    throw th;
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                mediaExtractor = mediaExtractor2;
                                                Logger.d(a, "handle stats reported response - releasing extractor");
                                                c(mediaExtractor);
                                                throw th;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            Object[] objArr3 = new Object[4];
                            objArr3[c] = "handle stats reported response - diff bigger than tome tolerance, continue to next frame. time tolerance= ";
                            objArr3[1] = Long.valueOf(a5);
                            objArr3[i2] = ",    diff= ";
                            objArr3[3] = Long.valueOf(abs);
                            Logger.d(a, objArr3);
                        }
                    }
                    Logger.d(a, "handle stats reported response - releasing extractor");
                    c(mediaExtractor2);
                } catch (Exception e3) {
                    e = e3;
                    mediaExtractor = mediaExtractor3;
                    Logger.d(a, "handle stats reported response - exception= ", e);
                    Logger.d(a, "handle stats reported response - releasing extractor");
                    c(mediaExtractor);
                } catch (Throwable th3) {
                    th = th3;
                    mediaExtractor = mediaExtractor3;
                    Logger.d(a, "handle stats reported response - releasing extractor");
                    c(mediaExtractor);
                    throw th;
                }
            } catch (Exception e4) {
                e = e4;
                mediaExtractor2 = mediaExtractor3;
            } catch (Throwable th4) {
                th = th4;
                mediaExtractor2 = mediaExtractor3;
            }
        } catch (Exception e5) {
            e = e5;
            mediaExtractor = null;
        } catch (Throwable th5) {
            th = th5;
            mediaExtractor = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(File file) {
        File[] listFiles;
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                b(file2);
            }
        }
        file.delete();
    }

    private static String a(long j2, String str) {
        return SafeDK.getInstance().ah() + "videoFrameImage_" + str + "_" + j2 + BrandSafetyUtils.a;
    }

    private static void a(String str, Bundle bundle, Bundle bundle2) {
        Logger.d(a, "report video frame upload event - frame file path= ", str);
        String string = bundle.getString(r);
        String string2 = bundle.getString("key");
        Bundle bundle3 = bundle.getBundle(t);
        g.a aVar = null;
        Bundle bundle4 = bundle3 != null ? bundle3.getBundle(u) : null;
        String string3 = bundle3 != null ? bundle3.getString(v) : null;
        bundle2.putString(q, string + string2);
        try {
            aVar = new com.safedk.android.a.c(str, (String) null, SafeDK.getInstance().L(), new FileUploadManager.b(string, string2, bundle4, string3)).a();
            Logger.d(a, "report video frame upload event - image upload response= ", aVar);
        } catch (IOException e2) {
            Logger.d(a, "report video frame upload event - exception= ", e2);
        }
        if (aVar != null) {
            AppLovinBridge.reportVideoFrameUploadEvent(bundle2, g.a());
        }
    }

    private static Bundle a(String str, String str2, Bundle bundle, double d2, int i2, int i3) {
        Bundle bundle2 = new Bundle();
        try {
            bundle2.putLong(p, BrandSafetyUtils.c(str));
            bundle2.putString(g, str2);
            bundle2.putBundle(o, bundle);
            bundle2.putDouble(i, d2);
            bundle2.putInt("w", i2);
            bundle2.putInt("h", i3);
            return bundle2;
        } catch (Exception e2) {
            Logger.d(a, "generate report bundle - exception= ", e2);
            return null;
        }
    }

    private static Bitmap a(Bitmap bitmap, int i2, int i3) {
        if (bitmap == null || i2 <= 0 || i3 <= 0) {
            return bitmap;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width <= i2 && height <= i3) {
            return bitmap;
        }
        float f2 = width;
        float f3 = height;
        float min = Math.min(i2 / f2, i3 / f3);
        return Bitmap.createScaledBitmap(bitmap, Math.round(f2 * min), Math.round(f3 * min), true);
    }

    private static int a(MediaExtractor mediaExtractor) {
        for (int i2 = 0; i2 < mediaExtractor.getTrackCount(); i2++) {
            String string = mediaExtractor.getTrackFormat(i2).getString("mime");
            if (string != null && string.startsWith(d)) {
                return i2;
            }
        }
        return -1;
    }

    private static long a(MediaExtractor mediaExtractor, long j2) {
        long j3;
        long j4;
        int i2 = 0;
        long j5 = -1;
        while (true) {
            long sampleTime = mediaExtractor.getSampleTime();
            if (sampleTime < 0) {
                j3 = -1;
                j4 = j5;
                break;
            }
            if (b(mediaExtractor)) {
                if (sampleTime <= j2) {
                    j5 = sampleTime;
                } else {
                    j4 = j5;
                    j3 = sampleTime;
                    break;
                }
            }
            mediaExtractor.advance();
            i2++;
            if (i2 > e) {
                j3 = -1;
                j4 = j5;
                break;
            }
        }
        return a(j2, j4, j3);
    }

    private static boolean b(MediaExtractor mediaExtractor) {
        int sampleFlags = mediaExtractor.getSampleFlags() & 1;
        return (sampleFlags == 0 && sampleFlags == 0) ? false : true;
    }

    private static long a(long j2, long j3, long j4) {
        if (j3 >= 0 || j4 >= 0) {
            return j3 < 0 ? j4 : (j4 >= 0 && Math.abs(j2 - j3) > Math.abs(j4 - j2)) ? j4 : j3;
        }
        return -1L;
    }

    private static MediaMetadataRetriever c(File file) {
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
            return mediaMetadataRetriever;
        } catch (Exception e2) {
            Logger.d(a, "get media metadata retriever - exception= ", e2);
            return null;
        }
    }

    private static Bitmap a(MediaMetadataRetriever mediaMetadataRetriever, long j2) {
        try {
            return mediaMetadataRetriever.getFrameAtTime(j2, 2);
        } catch (Exception e2) {
            Logger.d(a, "get closest key frame bitmap - exception= ", e2);
            return null;
        }
    }

    private static long a(double d2) {
        return (long) (d2 * 1000000.0d);
    }

    private static void c(MediaExtractor mediaExtractor) {
        if (mediaExtractor == null) {
            return;
        }
        try {
            mediaExtractor.release();
        } catch (Exception e2) {
        }
    }
}
