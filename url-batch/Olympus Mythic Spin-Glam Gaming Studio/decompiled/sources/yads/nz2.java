package yads;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes15.dex */
public final class nz2 extends mr {
    public static final Pattern h = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);
    public static final Pattern i = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);
    public static final Pattern j = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    public nz2(String str, long j2, long j3, long j4, File file) {
        super(str, j2, j3, j4, file);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ea, code lost:
    
        if (r16.renameTo(r3) == false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ef A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static nz2 a(File file, long j2, long j3, ds dsVar) {
        File file2;
        long j4;
        String group;
        File file3;
        String name = file.getName();
        if (name.endsWith(".v3.exo")) {
            file2 = file;
        } else {
            String name2 = file.getName();
            Matcher matcher = i.matcher(name2);
            if (matcher.matches()) {
                group = matcher.group(1);
                group.getClass();
                int i2 = sb3.a;
                int length = group.length();
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < length; i5++) {
                    if (group.charAt(i5) == '%') {
                        i4++;
                    }
                }
                if (i4 != 0) {
                    int i6 = length - (i4 * 2);
                    StringBuilder sb = new StringBuilder(i6);
                    Matcher matcher2 = sb3.i.matcher(group);
                    while (i4 > 0 && matcher2.find()) {
                        String group2 = matcher2.group(1);
                        group2.getClass();
                        char parseInt = (char) Integer.parseInt(group2, 16);
                        sb.append((CharSequence) group, i3, matcher2.start());
                        sb.append(parseInt);
                        i3 = matcher2.end();
                        i4--;
                    }
                    if (i3 < length) {
                        sb.append((CharSequence) group, i3, length);
                    }
                    if (sb.length() == i6) {
                        group = sb.toString();
                    }
                    group = null;
                }
                if (group != null) {
                    File parentFile = file.getParentFile();
                    if (parentFile == null) {
                        throw new IllegalStateException();
                    }
                    int i7 = dsVar.a(group).a;
                    String group3 = matcher.group(2);
                    group3.getClass();
                    long parseLong = Long.parseLong(group3);
                    String group4 = matcher.group(3);
                    group4.getClass();
                    file3 = new File(parentFile, i7 + "." + parseLong + "." + Long.parseLong(group4) + ".v3.exo");
                }
                file3 = null;
                if (file3 == null) {
                    return null;
                }
                name = file3.getName();
                file2 = file3;
            } else {
                matcher = h.matcher(name2);
                if (matcher.matches()) {
                    group = matcher.group(1);
                    group.getClass();
                    if (group != null) {
                    }
                    file3 = null;
                    if (file3 == null) {
                    }
                }
                group = null;
                if (group != null) {
                }
                file3 = null;
                if (file3 == null) {
                }
            }
        }
        Matcher matcher3 = j.matcher(name);
        if (!matcher3.matches()) {
            return null;
        }
        String group5 = matcher3.group(1);
        group5.getClass();
        String str = (String) dsVar.b.get(Integer.parseInt(group5));
        if (str == null) {
            return null;
        }
        long length2 = j2 == -1 ? file2.length() : j2;
        if (length2 == 0) {
            return null;
        }
        String group6 = matcher3.group(2);
        group6.getClass();
        long parseLong2 = Long.parseLong(group6);
        if (j3 == -9223372036854775807L) {
            String group7 = matcher3.group(3);
            group7.getClass();
            j4 = Long.parseLong(group7);
        } else {
            j4 = j3;
        }
        return new nz2(str, parseLong2, length2, j4, file2);
    }
}
