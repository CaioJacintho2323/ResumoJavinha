package com.caiojacintho.javacore.padroesdeprojeto.dominio;

public class ReportoDto {
    private String aircraftName;
    private Country country;
    private Currency currency;
    private String personName;


    public static final class ReportoDtoBuilder {
        private String aircraftName;
        private Country country;
        private Currency currency;
        private String personName;

        private ReportoDtoBuilder() {
        }

        public static ReportoDtoBuilder builder() {
            return new ReportoDtoBuilder();
        }

        public ReportoDtoBuilder aircraftName(String aircraftName) {
            this.aircraftName = aircraftName;
            return this;
        }

        public ReportoDtoBuilder country(Country country) {
            this.country = country;
            return this;
        }

        public ReportoDtoBuilder currency(Currency currency) {
            this.currency = currency;
            return this;
        }

        public ReportoDtoBuilder personName(String personName) {
            this.personName = personName;
            return this;
        }

        public ReportoDto build() {
            ReportoDto reportoDto = new ReportoDto();
            reportoDto.aircraftName = this.aircraftName;
            reportoDto.country = this.country;
            reportoDto.currency = this.currency;
            reportoDto.personName = this.personName;
            return reportoDto;
        }
    }
    @Override
    public String toString() {
        return "ReportoDtoBuilder{" +
                "aircraftName='" + aircraftName + '\'' +
                ", country=" + country +
                ", currency=" + currency +
                ", personName='" + personName + '\'' +
                '}';
    }
}
