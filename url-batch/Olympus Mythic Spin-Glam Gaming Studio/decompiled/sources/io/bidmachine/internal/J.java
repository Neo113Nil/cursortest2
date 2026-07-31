package io.bidmachine.internal;

import android.content.Context;
import io.bidmachine.util.file.FileUtilsKt;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class J {
    public static final a b = new a(null);
    private final Context a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public J(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.a = applicationContext;
    }

    private final File b() {
        File file = new File(this.a.getFilesDir(), "bm/quality/startup");
        file.mkdirs();
        return file;
    }

    public final Object a(I startupMetrics) {
        Intrinsics.checkNotNullParameter(startupMetrics, "startupMetrics");
        try {
            Result.Companion companion = Result.INSTANCE;
            File b2 = b();
            if (b2.exists()) {
                File file = new File(b2, startupMetrics.b() + ".trace.json");
                String jSONObject = b(startupMetrics).toString();
                Intrinsics.checkNotNullExpressionValue(jSONObject, "startupMetrics.toJSONObject().toString()");
                FilesKt.writeText$default(file, jSONObject, null, 2, null);
            }
            return Result.m8023constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
    }

    private final JSONObject b(I i) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("startInitTime", i.b());
        jSONObject.put("initDuration", i.a());
        jSONObject.put("finished", i.c());
        return jSONObject;
    }

    public final List a(long j) {
        I i;
        List list = null;
        try {
            File b2 = b();
            if (!b2.exists()) {
                list = CollectionsKt.emptyList();
            } else {
                File[] listFiles = b2.listFiles();
                if (listFiles == null) {
                    listFiles = new File[0];
                }
                ArrayList<File> arrayList = new ArrayList();
                for (File file : listFiles) {
                    String name = file.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "it.name");
                    int indexOf$default = StringsKt.indexOf$default((CharSequence) name, ".", 0, false, 6, (Object) null);
                    if (indexOf$default >= 1) {
                        String name2 = file.getName();
                        Intrinsics.checkNotNullExpressionValue(name2, "it.name");
                        Long longOrNull = StringsKt.toLongOrNull(StringsKt.take(name2, indexOf$default));
                        if (longOrNull != null && longOrNull.longValue() > j) {
                            arrayList.add(file);
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (File it : arrayList) {
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    String readSafely = FileUtilsKt.readSafely(it);
                    if (readSafely != null) {
                        arrayList2.add(readSafely);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    try {
                        i = a(new JSONObject((String) it2.next()));
                    } catch (Throwable unused) {
                        i = null;
                    }
                    if (i != null) {
                        arrayList3.add(i);
                    }
                }
                list = arrayList3;
            }
        } catch (Throwable unused2) {
        }
        return list == null ? CollectionsKt.emptyList() : list;
    }

    public final void a() {
        try {
            Result.Companion companion = Result.INSTANCE;
            Result.m8023constructorimpl(Boolean.valueOf(FileUtilsKt.deleteFile(b())));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
    }

    private final I a(JSONObject jSONObject) {
        try {
            return new I(jSONObject.getLong("startInitTime"), jSONObject.getLong("initDuration"), jSONObject.getBoolean("finished"));
        } catch (Throwable unused) {
            return null;
        }
    }
}
