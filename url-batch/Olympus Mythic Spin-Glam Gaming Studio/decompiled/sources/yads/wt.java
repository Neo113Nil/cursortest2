package yads;

/* loaded from: classes4.dex */
public abstract class wt implements ig2 {
    public abstract boolean a(char c);

    @Override // yads.ig2
    public final boolean apply(Object obj) {
        return a(((Character) obj).charValue());
    }
}
