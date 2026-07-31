package net.pubnative.lite.sdk.utils.svgparser;

import java.util.HashMap;
import java.util.Map;
import net.pubnative.lite.sdk.utils.svgparser.utils.TextScanner;

/* loaded from: classes13.dex */
public class PreserveAspectRatio {
    public static final PreserveAspectRatio BOTTOM;
    public static final PreserveAspectRatio END;
    public static final PreserveAspectRatio FULLSCREEN;
    public static final PreserveAspectRatio FULLSCREEN_START;
    public static final PreserveAspectRatio LETTERBOX;
    public static final PreserveAspectRatio START;
    public static final PreserveAspectRatio STRETCH;
    public static final PreserveAspectRatio TOP;
    public static final PreserveAspectRatio UNSCALED;
    private static final Map<String, Alignment> aspectRatioKeywords;
    private final Alignment alignment;
    private final Scale scale;

    public enum Alignment {
        none,
        xMinYMin,
        xMidYMin,
        xMaxYMin,
        xMinYMid,
        xMidYMid,
        xMaxYMid,
        xMinYMax,
        xMidYMax,
        xMaxYMax
    }

    public enum Scale {
        meet,
        slice
    }

    static {
        HashMap hashMap = new HashMap(10);
        aspectRatioKeywords = hashMap;
        UNSCALED = new PreserveAspectRatio(null, null);
        Alignment alignment = Alignment.none;
        STRETCH = new PreserveAspectRatio(alignment, null);
        Alignment alignment2 = Alignment.xMidYMid;
        Scale scale = Scale.meet;
        LETTERBOX = new PreserveAspectRatio(alignment2, scale);
        Alignment alignment3 = Alignment.xMinYMin;
        START = new PreserveAspectRatio(alignment3, scale);
        Alignment alignment4 = Alignment.xMaxYMax;
        END = new PreserveAspectRatio(alignment4, scale);
        Alignment alignment5 = Alignment.xMidYMin;
        TOP = new PreserveAspectRatio(alignment5, scale);
        Alignment alignment6 = Alignment.xMidYMax;
        BOTTOM = new PreserveAspectRatio(alignment6, scale);
        Scale scale2 = Scale.slice;
        FULLSCREEN = new PreserveAspectRatio(alignment2, scale2);
        FULLSCREEN_START = new PreserveAspectRatio(alignment3, scale2);
        hashMap.put("none", alignment);
        hashMap.put("xMinYMin", alignment3);
        hashMap.put("xMidYMin", alignment5);
        hashMap.put("xMaxYMin", Alignment.xMaxYMin);
        hashMap.put("xMinYMid", Alignment.xMinYMid);
        hashMap.put("xMidYMid", alignment2);
        hashMap.put("xMaxYMid", Alignment.xMaxYMid);
        hashMap.put("xMinYMax", Alignment.xMinYMax);
        hashMap.put("xMidYMax", alignment6);
        hashMap.put("xMaxYMax", alignment4);
    }

    PreserveAspectRatio(Alignment alignment, Scale scale) {
        this.alignment = alignment;
        this.scale = scale;
    }

    public static PreserveAspectRatio of(String str) {
        try {
            return parsePreserveAspectRatio(str);
        } catch (SVGParseException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    private static PreserveAspectRatio parsePreserveAspectRatio(String str) {
        Scale scale;
        TextScanner textScanner = new TextScanner(str);
        textScanner.skipWhitespace();
        String nextToken = textScanner.nextToken();
        if ("defer".equals(nextToken)) {
            textScanner.skipWhitespace();
            nextToken = textScanner.nextToken();
        }
        Alignment alignment = aspectRatioKeywords.get(nextToken);
        if (alignment == null) {
            throw new SVGParseException("Invalid preserveAspectRatio alignment value: " + str);
        }
        textScanner.skipWhitespace();
        if (textScanner.empty()) {
            scale = null;
        } else {
            String nextToken2 = textScanner.nextToken();
            nextToken2.getClass();
            if (nextToken2.equals("meet")) {
                scale = Scale.meet;
            } else {
                if (!nextToken2.equals("slice")) {
                    throw new SVGParseException("Invalid preserveAspectRatio definition: " + str);
                }
                scale = Scale.slice;
            }
        }
        return new PreserveAspectRatio(alignment, scale);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PreserveAspectRatio preserveAspectRatio = (PreserveAspectRatio) obj;
        return this.alignment == preserveAspectRatio.alignment && this.scale == preserveAspectRatio.scale;
    }

    public Alignment getAlignment() {
        return this.alignment;
    }

    public Scale getScale() {
        return this.scale;
    }

    public String toString() {
        return this.alignment + " " + this.scale;
    }
}
