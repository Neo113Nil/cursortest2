package yads;

/* loaded from: classes5.dex */
public abstract class qn3 {
    public static boolean a(pd0 pd0Var) {
        xb2 xb2Var = new xb2(8);
        int i = pn3.a(pd0Var, xb2Var).a;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        pd0Var.b(xb2Var.a, 0, 4, false);
        xb2Var.e(0);
        int a = xb2Var.a();
        if (a == 1463899717) {
            return true;
        }
        gh1.b("WavHeaderReader", "Unsupported form type: " + a);
        return false;
    }

    public static pn3 a(int i, pd0 pd0Var, xb2 xb2Var) {
        pn3 a = pn3.a(pd0Var, xb2Var);
        while (a.a != i) {
            gh1.d("WavHeaderReader", "Ignoring unknown WAV chunk: " + a.a);
            long j = a.b + 8;
            if (j <= 2147483647L) {
                pd0Var.a((int) j);
                a = pn3.a(pd0Var, xb2Var);
            } else {
                throw cc2.a("Chunk is too large (~2GB+) to skip; id: " + a.a);
            }
        }
        return a;
    }
}
