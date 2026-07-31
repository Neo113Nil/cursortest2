package com.ysocorp.ysonetwork.utils;

import androidx.annotation.RequiresApi;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;

@RequiresApi
/* loaded from: classes3.dex */
public class YNFileApi26Helper {
    public static OutputStream openStream(String str) throws IOException {
        Path path;
        OutputStream newOutputStream;
        path = Paths.get(str, new String[0]);
        newOutputStream = Files.newOutputStream(path, new OpenOption[0]);
        return new BufferedOutputStream(newOutputStream);
    }
}
