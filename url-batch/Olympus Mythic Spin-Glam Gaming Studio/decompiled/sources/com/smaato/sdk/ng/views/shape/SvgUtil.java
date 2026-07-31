package com.smaato.sdk.ng.views.shape;

import android.content.Context;
import com.smaato.sdk.ng.views.shape.path.parser.IoUtil;
import com.smaato.sdk.ng.views.shape.path.parser.PathInfo;
import com.smaato.sdk.ng.views.shape.path.parser.SvgToPath;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public class SvgUtil {
    private static final Map<Integer, PathInfo> a = new ConcurrentHashMap();

    public static PathInfo readSvg(Context context, int i) {
        Map<Integer, PathInfo> map = a;
        PathInfo pathInfo = map.get(Integer.valueOf(i));
        if (pathInfo != null) {
            return pathInfo;
        }
        InputStream inputStream = null;
        try {
            inputStream = context.getResources().openRawResource(i);
            PathInfo sVGFromInputStream = SvgToPath.getSVGFromInputStream(inputStream);
            map.put(Integer.valueOf(i), sVGFromInputStream);
            return sVGFromInputStream;
        } finally {
            IoUtil.closeQuitely(inputStream);
        }
    }
}
