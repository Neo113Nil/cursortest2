# Cloaking hints — SportySpin (com.haryananewspaper.newsindia)

- Play title «SportySpin» ≠ APK application-label «Sisal».
- Launcher: `SplashActivity.onCreate` → `Integrity.Builder.setHash(R.string.ual)` (CPlusV2.decrypt with package name) → `https://clodabu.xyz/5h4BQnxBp/`.
- Credentials: `R.raw.android_entries` service account, cloudProjectNumber `318724638109`, applicationName `iron-verbena-510116-q4`.
- `SplashIntegrityActivity`: SharedPreferences `IL` keys `UUID`, `isT` (`T`/`NT`). First launch → StandardIntegrityManager token → `decodeIntegrityToken` on playintegrity.googleapis.com.
- Pass (PLAY_RECOGNIZED + device integrity + LICENSED) → `AdvertisingActivity` WebView. Fail → `MainActivity` (белая гонка).
- WebView: `net.pubnative.hybid.sdk.viewability.WebView.loadUrl`, `defpackage.mb0.shouldOverrideUrlLoading` (остаётся во встроенном окне). JS bridge `Android.acceptGDPR` / `declineGDPR`.
- Custom Tabs нет. Рекламных сетей нет: пакет `net.pubnative` — обёртка проверки и WebView, не показ баннеров HyBid.
