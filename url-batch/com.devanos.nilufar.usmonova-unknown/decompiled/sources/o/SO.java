package o;

import java.io.IOException;

/* loaded from: classes.dex */
public final class SO extends RuntimeException {
    public final IOException h;
    public IOException i;

    public SO(IOException iOException) {
        super(iOException);
        this.h = iOException;
        this.i = iOException;
    }
}
