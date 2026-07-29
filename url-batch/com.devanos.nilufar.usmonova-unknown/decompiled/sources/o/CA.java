package o;

import java.io.PrintWriter;

/* loaded from: classes.dex */
public final class CA extends AA {
    public final InterfaceC0365Nz a;
    public final BA b;

    public CA(InterfaceC0365Nz interfaceC0365Nz, C0680a00 c0680a00) {
        this.a = interfaceC0365Nz;
        AbstractC0048Bt.n(c0680a00, "store");
        C0630Ye c0630Ye = C0630Ye.b;
        AbstractC0048Bt.n(c0630Ye, "defaultCreationExtras");
        ZZ zz = new ZZ(c0680a00, BA.c, c0630Ye);
        InterfaceC0517Tv G = AbstractC1473m3.G(BA.class);
        String a = G.a();
        if (a == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        this.b = (BA) zz.a(G, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(a));
    }

    public final void b(String str, PrintWriter printWriter) {
        PS ps = this.b.b;
        if (ps.j > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            if (ps.j <= 0) {
                return;
            }
            if (ps.i[0] != null) {
                throw new ClassCastException();
            }
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(ps.h[0]);
            printWriter.print(": ");
            throw null;
        }
    }

    public final String toString() {
        int lastIndexOf;
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        InterfaceC0365Nz interfaceC0365Nz = this.a;
        if (interfaceC0365Nz == null) {
            sb.append("null");
        } else {
            String simpleName = interfaceC0365Nz.getClass().getSimpleName();
            if (simpleName.length() <= 0 && (lastIndexOf = (simpleName = interfaceC0365Nz.getClass().getName()).lastIndexOf(46)) > 0) {
                simpleName = simpleName.substring(lastIndexOf + 1);
            }
            sb.append(simpleName);
            sb.append('{');
            sb.append(Integer.toHexString(System.identityHashCode(interfaceC0365Nz)));
        }
        sb.append("}}");
        return sb.toString();
    }
}
