package com.pbcovid19project.Models;

public class Jsons {

    String home_treatment_images, home_treatment_links, lab_test, donate,
            tweets, faq, epass, corona, cbse, vocational_education, go, toll_numbers;

    public Jsons() {
    }

    public Jsons(String home_treatment_images, String home_treatment_links, String lab_test, String donate, String tweets, String faq, String epass, String corona, String cbse, String vocational_education, String go, String toll_numbers) {
        this.home_treatment_images = home_treatment_images;
        this.home_treatment_links = home_treatment_links;
        this.lab_test = lab_test;
        this.donate = donate;
        this.tweets = tweets;
        this.faq = faq;
        this.epass = epass;
        this.corona = corona;
        this.cbse = cbse;
        this.vocational_education = vocational_education;
        this.go = go;
        this.toll_numbers = toll_numbers;
    }

    public String getHome_treatment_images() {
        return home_treatment_images;
    }

    public void setHome_treatment_images(String home_treatment_images) {
        this.home_treatment_images = home_treatment_images;
    }

    public String getHome_treatment_links() {
        return home_treatment_links;
    }

    public void setHome_treatment_links(String home_treatment_links) {
        this.home_treatment_links = home_treatment_links;
    }

    public String getLab_test() {
        return lab_test;
    }

    public void setLab_test(String lab_test) {
        this.lab_test = lab_test;
    }

    public String getDonate() {
        return donate;
    }

    public void setDonate(String donate) {
        this.donate = donate;
    }

    public String getTweets() {
        return tweets;
    }

    public void setTweets(String tweets) {
        this.tweets = tweets;
    }

    public String getFaq() {
        return faq;
    }

    public void setFaq(String faq) {
        this.faq = faq;
    }

    public String getEpass() {
        return epass;
    }

    public void setEpass(String epass) {
        this.epass = epass;
    }

    public String getCorona() {
        return corona;
    }

    public void setCorona(String corona) {
        this.corona = corona;
    }

    public String getCbse() {
        return cbse;
    }

    public void setCbse(String cbse) {
        this.cbse = cbse;
    }

    public String getVocational_education() {
        return vocational_education;
    }

    public void setVocational_education(String vocational_education) {
        this.vocational_education = vocational_education;
    }

    public String getGo() {
        return go;
    }

    public void setGo(String go) {
        this.go = go;
    }

    public String getToll_numbers() {
        return toll_numbers;
    }

    public void setToll_numbers(String toll_numbers) {
        this.toll_numbers = toll_numbers;
    }
}
