package com.fyber.inneractive.sdk.player.exoplayer2.util;

import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes6.dex */
public final class c {
    public final File a;
    public final File b;

    public c(File file) {
        this.a = file;
        this.b = new File(file.getPath() + ".bak");
    }

    public final FileInputStream a() {
        if (this.b.exists()) {
            this.a.delete();
            this.b.renameTo(this.a);
        }
        return new FileInputStream(this.a);
    }

    public final b b() {
        if (this.a.exists()) {
            if (this.b.exists()) {
                this.a.delete();
            } else if (!this.a.renameTo(this.b)) {
                Log.w("AtomicFile", "Couldn't rename file " + this.a + " to backup file " + this.b);
            }
        }
        try {
            return new b(this.a);
        } catch (FileNotFoundException unused) {
            if (!this.a.getParentFile().mkdirs()) {
                throw new IOException("Couldn't create directory " + this.a);
            }
            try {
                return new b(this.a);
            } catch (FileNotFoundException unused2) {
                throw new IOException("Couldn't create " + this.a);
            }
        }
    }
}
