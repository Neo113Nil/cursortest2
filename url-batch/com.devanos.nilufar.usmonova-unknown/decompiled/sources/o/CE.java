package o;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/* loaded from: classes.dex */
public final class CE extends C0232Iv {
    public static Long i(FileTime fileTime) {
        long millis;
        millis = fileTime.toMillis();
        Long valueOf = Long.valueOf(millis);
        if (millis != 0) {
            return valueOf;
        }
        return null;
    }

    @Override // o.C0232Iv, o.AbstractC0533Ul
    public final void a(CH ch, CH ch2) {
        AbstractC0048Bt.n(ch2, "target");
        try {
            Files.move(ch.f(), ch2.f(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e) {
            throw new FileNotFoundException(e.getMessage());
        }
    }

    @Override // o.C0232Iv, o.AbstractC0533Ul
    public final C0507Tl e(CH ch) {
        AbstractC0048Bt.n(ch, "path");
        Path f = ch.f();
        try {
            BasicFileAttributes readAttributes = Files.readAttributes(f, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            Path readSymbolicLink = readAttributes.isSymbolicLink() ? Files.readSymbolicLink(f) : null;
            boolean isRegularFile = readAttributes.isRegularFile();
            boolean isDirectory = readAttributes.isDirectory();
            if (readSymbolicLink != null) {
                String str = CH.i;
                C0218Ih.r(readSymbolicLink.toString(), false);
            }
            Long valueOf = Long.valueOf(readAttributes.size());
            FileTime creationTime = readAttributes.creationTime();
            Long i = creationTime != null ? i(creationTime) : null;
            FileTime lastModifiedTime = readAttributes.lastModifiedTime();
            Long i2 = lastModifiedTime != null ? i(lastModifiedTime) : null;
            FileTime lastAccessTime = readAttributes.lastAccessTime();
            return new C0507Tl(isRegularFile, isDirectory, valueOf, i, i2, lastAccessTime != null ? i(lastAccessTime) : null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // o.C0232Iv
    public final String toString() {
        return "NioSystemFileSystem";
    }
}
