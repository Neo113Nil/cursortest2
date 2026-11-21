# Cloaking hints (Tigrinho Aposta / REGALBOURNE LIMITED / Plunder of the Galleon)

- Play/карточка «Tigrinho Aposta» ≠ application-label «Plunder of the Galleon».
- Application: `com.pairip.application.Application` extends `PushApplication`; `attachBaseContext` → `LicenseClient.checkLicense` (Play license, не gate).
- `PushApplication.onCreate`: SharedPreferences `"push"`, UUID `installation_id`, OneSignal `initWithContext("2938423b-50a9-4ebc-86f4-4ded471fddfc")`, `login(installation_id)`.
- LAUNCHER: `MainActivity` → после запроса POST_NOTIFICATIONS вызывает `a()`: OneSignal opt-in, URL через `md.g.A` (по умолчанию `https://plunderofthegalleon.win/`; `push_url` только если тот же host), снимает `sub_id_1`/`sub_id_2`/`ext_uuid`/`bundle_id`, добавляет `ext_uuid` + `bundle_id`, стартует `com.google.androidbrowserhelper.trusted.LauncherActivity` (TWA / Custom Tabs).
- Fallback: `WebViewFallbackActivity`, если нет подходящего браузера.
- First-party HTTP gate (OkHttp/HttpURLConnection на свой хост) нет. Фильтрации по стране/боту в APK нет.
- `config.ru` в пайплайне = языковой сплит `splits0.xml` (`split="config.ru"`), не сетевой хост.
- `theme.app` в пайплайне = стиль `@style/Theme.App`, не сетевой хост.
