package yads;

import android.content.Context;
import android.os.Handler;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class ve0 {
    public final Context a;
    public boolean d;
    public final ge0 b = new ge0();
    public int c = 0;
    public final ik1 e = ik1.a;

    public ve0(Context context) {
        this.a = context;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:36|37|38|39|40|41|42|43|44|45|46|47|48|49|(2:50|51)|53|54|55|(2:56|57)|(2:59|60)) */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final fo[] a(Handler handler, un0 un0Var, un0 un0Var2, un0 un0Var3, un0 un0Var4) {
        gc0 gc0Var;
        int i;
        int i2;
        un0 un0Var5;
        Class cls;
        Class cls2;
        int i3;
        int i4;
        int i5;
        ArrayList arrayList = new ArrayList();
        Context context = this.a;
        int i6 = this.c;
        arrayList.add(new vk1(context, this.b, this.e, this.d, handler, un0Var));
        if (i6 != 0) {
            int size = arrayList.size();
            if (i6 == 2) {
                size--;
            }
            try {
                try {
                    i5 = size + 1;
                } catch (ClassNotFoundException unused) {
                }
                try {
                    arrayList.add(size, (fo) Class.forName("com.monetization.ads.exo.ext.vp9.LibvpxVideoRenderer").getConstructor(Long.TYPE, Handler.class, cj3.class, Integer.TYPE).newInstance(5000L, handler, un0Var, 50));
                    gh1.c("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");
                } catch (ClassNotFoundException unused2) {
                    size = i5;
                    i5 = size;
                    arrayList.add(i5, (fo) Class.forName("com.monetization.ads.exo.ext.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, Handler.class, cj3.class, Integer.TYPE).newInstance(5000L, handler, un0Var, 50));
                    gh1.c("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
                    Context context2 = this.a;
                    gc0Var = new gc0();
                    sj a = sj.a(context2);
                    a.getClass();
                    gc0Var.a = a;
                    if (gc0Var.b == null) {
                    }
                    pc0 pc0Var = new pc0(gc0Var);
                    Context context3 = this.a;
                    i = this.c;
                    arrayList.add(new zj1(context3, this.b, this.e, this.d, handler, un0Var2, pc0Var));
                    if (i != 0) {
                    }
                    arrayList.add(new m63(un0Var3, handler.getLooper()));
                    arrayList.add(new kt1(un0Var4, handler.getLooper()));
                    arrayList.add(new at());
                    return (fo[]) arrayList.toArray(new fo[0]);
                }
                try {
                    arrayList.add(i5, (fo) Class.forName("com.monetization.ads.exo.ext.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, Handler.class, cj3.class, Integer.TYPE).newInstance(5000L, handler, un0Var, 50));
                    gh1.c("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
                } catch (ClassNotFoundException unused3) {
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating AV1 extension", e);
                }
            } catch (Exception e2) {
                throw new RuntimeException("Error instantiating VP9 extension", e2);
            }
        }
        Context context22 = this.a;
        gc0Var = new gc0();
        sj a2 = sj.a(context22);
        a2.getClass();
        gc0Var.a = a2;
        if (gc0Var.b == null) {
            gc0Var.b = new ic0(new zj[0]);
        }
        pc0 pc0Var2 = new pc0(gc0Var);
        Context context32 = this.a;
        i = this.c;
        arrayList.add(new zj1(context32, this.b, this.e, this.d, handler, un0Var2, pc0Var2));
        if (i != 0) {
            int size2 = arrayList.size();
            if (i == 2) {
                size2--;
            }
            try {
                try {
                    i2 = size2 + 1;
                } catch (ClassNotFoundException unused4) {
                }
                try {
                    try {
                        arrayList.add(size2, (fo) Class.forName("com.monetization.ads.exo.decoder.midi.MidiRenderer").getConstructor(null).newInstance(null));
                        gh1.c("DefaultRenderersFactory", "Loaded MidiRenderer.");
                    } catch (ClassNotFoundException unused5) {
                        size2 = i2;
                        i2 = size2;
                        try {
                            cls = gk.class;
                            cls2 = Handler.class;
                            un0Var5 = un0Var2;
                            try {
                                i3 = i2 + 1;
                                arrayList.add(i2, (fo) Class.forName("com.monetization.ads.exo.ext.opus.LibopusAudioRenderer").getConstructor(cls2, bk.class, cls).newInstance(handler, un0Var5, pc0Var2));
                                gh1.c("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
                            } catch (ClassNotFoundException unused6) {
                            }
                            i4 = i3 + 1;
                            arrayList.add(i3, (fo) Class.forName("com.monetization.ads.exo.ext.flac.LibflacAudioRenderer").getConstructor(cls2, bk.class, cls).newInstance(handler, un0Var5, pc0Var2));
                            gh1.c("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                            arrayList.add(i4, (fo) Class.forName("com.monetization.ads.exo.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(cls2, bk.class, cls).newInstance(handler, un0Var5, pc0Var2));
                            gh1.c("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                            arrayList.add(new m63(un0Var3, handler.getLooper()));
                            arrayList.add(new kt1(un0Var4, handler.getLooper()));
                            arrayList.add(new at());
                            return (fo[]) arrayList.toArray(new fo[0]);
                        } catch (Exception e3) {
                            throw new RuntimeException("Error instantiating Opus extension", e3);
                        }
                    }
                    try {
                        arrayList.add(i2, (fo) Class.forName("com.monetization.ads.exo.ext.opus.LibopusAudioRenderer").getConstructor(cls2, bk.class, cls).newInstance(handler, un0Var5, pc0Var2));
                        gh1.c("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
                    } catch (ClassNotFoundException unused7) {
                        i2 = i3;
                        i3 = i2;
                        i4 = i3 + 1;
                        arrayList.add(i3, (fo) Class.forName("com.monetization.ads.exo.ext.flac.LibflacAudioRenderer").getConstructor(cls2, bk.class, cls).newInstance(handler, un0Var5, pc0Var2));
                        gh1.c("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                        arrayList.add(i4, (fo) Class.forName("com.monetization.ads.exo.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(cls2, bk.class, cls).newInstance(handler, un0Var5, pc0Var2));
                        gh1.c("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                        arrayList.add(new m63(un0Var3, handler.getLooper()));
                        arrayList.add(new kt1(un0Var4, handler.getLooper()));
                        arrayList.add(new at());
                        return (fo[]) arrayList.toArray(new fo[0]);
                    }
                    i4 = i3 + 1;
                    try {
                        arrayList.add(i3, (fo) Class.forName("com.monetization.ads.exo.ext.flac.LibflacAudioRenderer").getConstructor(cls2, bk.class, cls).newInstance(handler, un0Var5, pc0Var2));
                        gh1.c("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                    } catch (ClassNotFoundException unused8) {
                        i3 = i4;
                        i4 = i3;
                        arrayList.add(i4, (fo) Class.forName("com.monetization.ads.exo.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(cls2, bk.class, cls).newInstance(handler, un0Var5, pc0Var2));
                        gh1.c("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                        arrayList.add(new m63(un0Var3, handler.getLooper()));
                        arrayList.add(new kt1(un0Var4, handler.getLooper()));
                        arrayList.add(new at());
                        return (fo[]) arrayList.toArray(new fo[0]);
                    }
                    try {
                        arrayList.add(i4, (fo) Class.forName("com.monetization.ads.exo.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(cls2, bk.class, cls).newInstance(handler, un0Var5, pc0Var2));
                        gh1.c("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                    } catch (ClassNotFoundException unused9) {
                    } catch (Exception e4) {
                        throw new RuntimeException("Error instantiating FFmpeg extension", e4);
                    }
                } catch (Exception e5) {
                    throw new RuntimeException("Error instantiating FLAC extension", e5);
                }
                try {
                    cls = gk.class;
                    cls2 = Handler.class;
                    try {
                        un0Var5 = un0Var2;
                        i3 = i2 + 1;
                    } catch (ClassNotFoundException unused10) {
                        un0Var5 = un0Var2;
                    }
                } catch (ClassNotFoundException unused11) {
                    un0Var5 = un0Var2;
                    cls = gk.class;
                    cls2 = Handler.class;
                }
            } catch (Exception e6) {
                throw new RuntimeException("Error instantiating MIDI extension", e6);
            }
        }
        arrayList.add(new m63(un0Var3, handler.getLooper()));
        arrayList.add(new kt1(un0Var4, handler.getLooper()));
        arrayList.add(new at());
        return (fo[]) arrayList.toArray(new fo[0]);
    }
}
