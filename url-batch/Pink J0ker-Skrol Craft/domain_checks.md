# Проверка подозрительных доменов

Кастомных и неизвестных хостов нет.

Пайплайн мог зацепить `app.adjust.io` / `gdpr.adjust.io` / `ssrv.adjust.io` (SDK Adjust),
`config.ru` (языковой split Android App Bundle `config.ru`, не сайт) и
`dispatchers.io` (класс Kotlin `Dispatchers.IO`, не сайт). По правилам отчёта
это не подозрительные домены.
