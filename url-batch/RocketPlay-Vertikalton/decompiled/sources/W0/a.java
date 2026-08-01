package W0;

/* loaded from: classes.dex */
public final class a extends i1.g implements h1.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1271b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1272c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i, Object obj) {
        super(1);
        this.f1271b = i;
        this.f1272c = obj;
    }

    @Override // h1.l
    public final Object g(Object obj) {
        switch (this.f1271b) {
            case 0:
                return obj == ((d) this.f1272c) ? "(this Collection)" : String.valueOf(obj);
            default:
                m1.c cVar = (m1.c) obj;
                i1.f.e(cVar, "it");
                String str = (String) this.f1272c;
                i1.f.e(str, "<this>");
                return str.subSequence(cVar.f3557a, cVar.f3558b + 1).toString();
        }
    }
}
