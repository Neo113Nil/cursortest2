package K1;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class u extends e {

    /* renamed from: m, reason: collision with root package name */
    public final Socket f778m;

    public u(Socket socket) {
        this.f778m = socket;
    }

    @Override // K1.e
    public final void j() {
        Socket socket = this.f778m;
        try {
            socket.close();
        } catch (AssertionError e2) {
            if (!F1.d.K(e2)) {
                throw e2;
            }
            m.f758a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
        } catch (Exception e3) {
            m.f758a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e3);
        }
    }

    public final IOException k(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
