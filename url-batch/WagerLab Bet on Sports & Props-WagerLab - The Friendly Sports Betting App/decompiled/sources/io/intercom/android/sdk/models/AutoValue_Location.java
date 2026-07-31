package io.intercom.android.sdk.models;

/* loaded from: classes8.dex */
final class AutoValue_Location extends Location {
    private final String cityName;
    private final String countryName;
    private final Integer timezoneOffset;

    AutoValue_Location(String str, String str2, Integer num) {
        if (str == null) {
            throw new NullPointerException("Null cityName");
        }
        this.cityName = str;
        if (str2 == null) {
            throw new NullPointerException("Null countryName");
        }
        this.countryName = str2;
        this.timezoneOffset = num;
    }

    @Override // io.intercom.android.sdk.models.Location
    public String getCityName() {
        return this.cityName;
    }

    @Override // io.intercom.android.sdk.models.Location
    public String getCountryName() {
        return this.countryName;
    }

    @Override // io.intercom.android.sdk.models.Location
    public Integer getTimezoneOffset() {
        return this.timezoneOffset;
    }

    public String toString() {
        return "Location{cityName=" + this.cityName + ", countryName=" + this.countryName + ", timezoneOffset=" + this.timezoneOffset + "}";
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Location) {
            Location location = (Location) obj;
            if (this.cityName.equals(location.getCityName()) && this.countryName.equals(location.getCountryName()) && ((num = this.timezoneOffset) != null ? num.equals(location.getTimezoneOffset()) : location.getTimezoneOffset() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((this.cityName.hashCode() ^ 1000003) * 1000003) ^ this.countryName.hashCode()) * 1000003;
        Integer num = this.timezoneOffset;
        return hashCode ^ (num == null ? 0 : num.hashCode());
    }
}
