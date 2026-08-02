package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final e f428b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f429c;

    /* renamed from: d, reason: collision with root package name */
    public static final e f430d;

    /* renamed from: e, reason: collision with root package name */
    public static final e f431e;

    /* renamed from: f, reason: collision with root package name */
    public static final e f432f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ e[] f433g;

    static {
        e eVar = new e("DESTROYED", 0);
        f428b = eVar;
        e eVar2 = new e("INITIALIZED", 1);
        f429c = eVar2;
        e eVar3 = new e("CREATED", 2);
        f430d = eVar3;
        e eVar4 = new e("STARTED", 3);
        f431e = eVar4;
        e eVar5 = new e("RESUMED", 4);
        f432f = eVar5;
        f433g = new e[]{eVar, eVar2, eVar3, eVar4, eVar5};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f433g.clone();
    }
}
