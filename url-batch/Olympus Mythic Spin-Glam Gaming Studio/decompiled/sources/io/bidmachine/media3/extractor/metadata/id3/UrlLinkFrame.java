package io.bidmachine.media3.extractor.metadata.id3;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import io.bidmachine.media3.common.util.UnstableApi;
import java.util.Objects;

@UnstableApi
/* loaded from: classes4.dex */
public final class UrlLinkFrame extends Id3Frame {

    @Nullable
    public final String description;
    public final String url;

    public UrlLinkFrame(String str, @Nullable String str2, String str3) {
        super(str);
        this.description = str2;
        this.url = str3;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || UrlLinkFrame.class != obj.getClass()) {
            return false;
        }
        UrlLinkFrame urlLinkFrame = (UrlLinkFrame) obj;
        return this.id.equals(urlLinkFrame.id) && Objects.equals(this.description, urlLinkFrame.description) && Objects.equals(this.url, urlLinkFrame.url);
    }

    public int hashCode() {
        int hashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.id.hashCode()) * 31;
        String str = this.description;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.url;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // io.bidmachine.media3.extractor.metadata.id3.Id3Frame
    public String toString() {
        return this.id + ": url=" + this.url;
    }
}
