package o;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class FS extends X6 {
    public final Socket m;

    public FS(Socket socket) {
        this.m = socket;
    }

    @Override // o.X6
    public final void j() {
        Socket socket = this.m;
        try {
            socket.close();
        } catch (AssertionError e) {
            if (!AbstractC0946e20.z(e)) {
                throw e;
            }
            OF.a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e);
        } catch (Exception e2) {
            OF.a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
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
