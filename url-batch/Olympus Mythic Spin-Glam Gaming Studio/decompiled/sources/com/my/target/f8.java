package com.my.target;

import com.my.target.common.models.ImageData;
import com.my.target.internal.api.internalnativead.models.InternalImageData;
import com.my.target.internal.api.internalnativead.models.InternalVideo;
import com.my.target.j7;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class f8 implements InternalVideo {
    private final j7.d a;
    private final InternalImageData b;
    final List c = new ArrayList();

    public f8(j7.d dVar) {
        this.a = dVar;
        this.b = i7.a(ImageData.newImageData(dVar.Y, dVar.Z, dVar.a0));
        for (int i = 0; i < dVar.b0.size(); i++) {
            this.c.add(e8.a((j7.e) dVar.b0.get(i)));
        }
    }

    public static f8 a(j7.d dVar) {
        return new f8(dVar);
    }

    public float getDuration() {
        return this.a.t();
    }

    public String getEvMovieId() {
        return this.a.X;
    }

    public List getFiles() {
        return this.c;
    }

    public InternalImageData getPreview() {
        return this.b;
    }
}
