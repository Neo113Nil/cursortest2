package io.ktor.client.plugins;

import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.text.Charsets;

/* compiled from: HttpPlainText.kt */
/* loaded from: classes6.dex */
public final class HttpPlainTextConfig {
    private Charset sendCharset;
    private final Set charsets = new LinkedHashSet();
    private final Map charsetQuality = new LinkedHashMap();
    private Charset responseCharsetFallback = Charsets.UTF_8;

    public final Set getCharsets$ktor_client_core() {
        return this.charsets;
    }

    public final Map getCharsetQuality$ktor_client_core() {
        return this.charsetQuality;
    }

    public final Charset getSendCharset() {
        return this.sendCharset;
    }

    public final Charset getResponseCharsetFallback() {
        return this.responseCharsetFallback;
    }
}
