package com.smaato.sdk.ng.vpaid.models.vast;

import com.smaato.sdk.ng.vpaid.xml.Tag;
import java.util.List;

/* loaded from: classes13.dex */
public class MediaFiles {

    @Tag
    private ClosedCaptionFiles closedCaptionFiles;

    @Tag("InteractiveCreativeFile")
    private List<InteractiveCreativeFile> interactiveCreativeFiles;

    @Tag("MediaFile")
    private List<MediaFile> mediaFiles;

    @Tag("Mezzanine")
    private List<Mezzanine> mezzanines;

    public ClosedCaptionFiles getClosedCaptionFiles() {
        return this.closedCaptionFiles;
    }

    public List<InteractiveCreativeFile> getInteractiveCreativeFiles() {
        return this.interactiveCreativeFiles;
    }

    public List<MediaFile> getMediaFiles() {
        return this.mediaFiles;
    }

    public List<Mezzanine> getMezzanines() {
        return this.mezzanines;
    }
}
