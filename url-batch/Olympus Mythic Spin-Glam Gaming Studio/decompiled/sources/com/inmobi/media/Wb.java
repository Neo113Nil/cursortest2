package com.inmobi.media;

import android.content.Context;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes13.dex */
public final class Wb {
    public final String a;
    public final long b;
    public final long c;
    public final int d;
    public final int e;
    public final WeakReference f;
    public final AtomicBoolean g;

    public Wb(Context context, String url, long j, long j2, int i, int i2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        this.a = url;
        this.b = j;
        this.c = j2;
        this.d = i;
        this.e = i2;
        WeakReference weakReference = new WeakReference(context);
        this.f = weakReference;
        this.g = new AtomicBoolean(false);
        Context context2 = (Context) weakReference.get();
        if (context2 != null) {
            CoroutineScope coroutineScope = AbstractC3995fc.a;
            AbstractC3967ec.a(new Vb(this, context2, null));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005c, code lost:
    
        if (r7 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, ContinuationImpl continuationImpl) {
        Sb sb;
        int i;
        Context context2;
        Iterator it;
        if (continuationImpl instanceof Sb) {
            sb = (Sb) continuationImpl;
            int i2 = sb.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sb.e = i2 - Integer.MIN_VALUE;
                Object obj = sb.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = sb.e;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.g.get()) {
                        return Unit.INSTANCE;
                    }
                    Kb kb = (Kb) Lb.a.getValue();
                    sb.a = context;
                    sb.e = 1;
                    obj = kb.a(sb);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = sb.b;
                        context2 = sb.a;
                        ResultKt.throwOnFailure(obj);
                        while (it.hasNext()) {
                            Db db = (Db) it.next();
                            String str = this.a;
                            sb.a = context2;
                            sb.b = it;
                            sb.e = 2;
                            if (b(str, db, sb) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    context = sb.a;
                    ResultKt.throwOnFailure(obj);
                }
                context2 = context;
                it = ((List) obj).iterator();
                while (it.hasNext()) {
                }
                return Unit.INSTANCE;
            }
        }
        sb = new Sb(this, continuationImpl);
        Object obj2 = sb.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = sb.e;
        if (i != 0) {
        }
        context2 = context;
        it = ((List) obj2).iterator();
        while (it.hasNext()) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0137, code lost:
    
        if (a(r2, r4) == r5) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0108, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r11, r4) != r5) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b2, code lost:
    
        if (r6 == r5) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x011c -> B:20:0x0123). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, Db db, ContinuationImpl continuationImpl) {
        Ub ub;
        Object coroutine_suspended;
        int i;
        Object a;
        InterfaceC3892bf interfaceC3892bf;
        String str2;
        Db db2;
        Ub ub2;
        Object obj;
        int i2;
        Db db3;
        Kb kb;
        String str3 = str;
        Db db4 = db;
        if (continuationImpl instanceof Ub) {
            ub = (Ub) continuationImpl;
            int i3 = ub.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ub.f = i3 - Integer.MIN_VALUE;
                Object obj2 = ub.d;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = ub.f;
                int i4 = 1;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    if (this.g.get()) {
                        return Unit.INSTANCE;
                    }
                    if (db4.d != 0 && System.currentTimeMillis() - db4.d < this.b) {
                        return Unit.INSTANCE;
                    }
                    ub.a = str3;
                    ub.b = db4;
                    ub.f = 1;
                    a = a(str3, db4, ub);
                } else if (i == 1) {
                    Db db5 = ub.b;
                    String str4 = ub.a;
                    ResultKt.throwOnFailure(obj2);
                    a = obj2;
                    db4 = db5;
                    str3 = str4;
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            db2 = ub.c;
                            db4 = ub.b;
                            str2 = ub.a;
                            ResultKt.throwOnFailure(obj2);
                            Db db6 = db4;
                            Db db7 = db2;
                            ub.a = str2;
                            ub.b = db6;
                            ub.c = null;
                            ub.f = 4;
                            Object a2 = a(str2, db7, ub);
                            if (a2 != coroutine_suspended) {
                                db4 = db6;
                                str3 = str2;
                                ub2 = ub;
                                obj = a2;
                                i4 = 1;
                                Ub ub3 = ub2;
                                interfaceC3892bf = (InterfaceC3892bf) obj;
                                ub = ub3;
                                if (interfaceC3892bf == null) {
                                }
                                db3 = new Db(db4.a, db4.b, i2, System.currentTimeMillis(), false, 0, 48);
                                kb = (Kb) Lb.a.getValue();
                                ub.a = str3;
                                ub.b = db4;
                                ub.c = db3;
                                ub.f = 2;
                                if (kb.b(db3, ub) != coroutine_suspended) {
                                }
                            }
                            return coroutine_suspended;
                        }
                        if (i != 4) {
                            if (i != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                            return Unit.INSTANCE;
                        }
                        Db db8 = ub.b;
                        String str5 = ub.a;
                        ResultKt.throwOnFailure(obj2);
                        ub2 = ub;
                        obj = obj2;
                        db4 = db8;
                        str3 = str5;
                        i4 = 1;
                        Ub ub32 = ub2;
                        interfaceC3892bf = (InterfaceC3892bf) obj;
                        ub = ub32;
                        if (!(interfaceC3892bf == null && Fl.a(interfaceC3892bf) == i4) && (i2 = db4.c + i4) < this.d) {
                            db3 = new Db(db4.a, db4.b, i2, System.currentTimeMillis(), false, 0, 48);
                            kb = (Kb) Lb.a.getValue();
                            ub.a = str3;
                            ub.b = db4;
                            ub.c = db3;
                            ub.f = 2;
                            if (kb.b(db3, ub) != coroutine_suspended) {
                                str2 = str3;
                                db2 = db3;
                                long j = this.b;
                                ub.a = str2;
                                ub.b = db4;
                                ub.c = db2;
                                ub.f = 3;
                            }
                        } else {
                            ub.a = null;
                            ub.b = null;
                            ub.f = 5;
                        }
                        return coroutine_suspended;
                    }
                    db2 = ub.c;
                    db4 = ub.b;
                    str2 = ub.a;
                    ResultKt.throwOnFailure(obj2);
                    long j2 = this.b;
                    ub.a = str2;
                    ub.b = db4;
                    ub.c = db2;
                    ub.f = 3;
                }
                interfaceC3892bf = (InterfaceC3892bf) a;
                if (interfaceC3892bf == null) {
                }
                db3 = new Db(db4.a, db4.b, i2, System.currentTimeMillis(), false, 0, 48);
                kb = (Kb) Lb.a.getValue();
                ub.a = str3;
                ub.b = db4;
                ub.c = db3;
                ub.f = 2;
                if (kb.b(db3, ub) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
        }
        ub = new Ub(this, continuationImpl);
        Object obj22 = ub.d;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = ub.f;
        int i42 = 1;
        if (i != 0) {
        }
        interfaceC3892bf = (InterfaceC3892bf) a;
        if (interfaceC3892bf == null) {
        }
        db3 = new Db(db4.a, db4.b, i2, System.currentTimeMillis(), false, 0, 48);
        kb = (Kb) Lb.a.getValue();
        ub.a = str3;
        ub.b = db4;
        ub.c = db3;
        ub.f = 2;
        if (kb.b(db3, ub) != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String url, Db data, ContinuationImpl continuationImpl) {
        Tb tb;
        int i;
        try {
            if (continuationImpl instanceof Tb) {
                tb = (Tb) continuationImpl;
                int i2 = tb.c;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    tb.c = i2 - Integer.MIN_VALUE;
                    Object obj = tb.a;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = tb.c;
                    if (i == 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    ResultKt.throwOnFailure(obj);
                    F9 f9 = (F9) Ve.h.getValue();
                    Intrinsics.checkNotNullParameter(url, "loggingUrl");
                    Intrinsics.checkNotNullParameter(data, "data");
                    Intrinsics.checkNotNullParameter(url, "url");
                    Ze ze = new Ze(url, null, null, new C3858a7(data.a), null, 54);
                    tb.c = 1;
                    Object a = f9.a.a(ze, tb);
                    return a == coroutine_suspended ? coroutine_suspended : a;
                }
            }
            if (i == 0) {
            }
        } catch (IllegalStateException unused) {
            return null;
        }
        tb = new Tb(this, continuationImpl);
        Object obj2 = tb.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = tb.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b7, code lost:
    
        if (r7 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b9, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0055, code lost:
    
        if (r7.a(r6, r0) == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00b7 -> B:11:0x00ba). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Db db, ContinuationImpl continuationImpl) {
        Rb rb;
        int i;
        Context context;
        List emptyList;
        Iterator it;
        if (continuationImpl instanceof Rb) {
            rb = (Rb) continuationImpl;
            int i2 = rb.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rb.e = i2 - Integer.MIN_VALUE;
                Object obj = rb.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = rb.e;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    AbstractC4023gc.a(db.a);
                    Kb kb = (Kb) Lb.a.getValue();
                    String str = db.a;
                    rb.e = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        String str2 = rb.b;
                        it = rb.a;
                        ResultKt.throwOnFailure(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            AbstractC4023gc.a(str2);
                        }
                        if (it.hasNext()) {
                            str2 = (String) it.next();
                            Kb kb2 = (Kb) Lb.a.getValue();
                            rb.a = it;
                            rb.b = str2;
                            rb.e = 2;
                            obj = kb2.b(str2, rb);
                        }
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                context = (Context) this.f.get();
                if (context != null) {
                    CoroutineScope coroutineScope = AbstractC3995fc.a;
                    String directoryPath = AbstractC3967ec.a(context);
                    Intrinsics.checkNotNullParameter(directoryPath, "directoryPath");
                    File file = new File(directoryPath);
                    if (file.exists() && file.isDirectory()) {
                        String[] list = file.list();
                        if (list == null || (emptyList = ArraysKt.toList(list)) == null) {
                            emptyList = CollectionsKt.emptyList();
                        }
                    } else {
                        emptyList = CollectionsKt.emptyList();
                    }
                    it = emptyList.iterator();
                    if (it.hasNext()) {
                    }
                }
                return Unit.INSTANCE;
            }
        }
        rb = new Rb(this, continuationImpl);
        Object obj2 = rb.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = rb.e;
        if (i != 0) {
        }
        context = (Context) this.f.get();
        if (context != null) {
        }
        return Unit.INSTANCE;
    }
}
