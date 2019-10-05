package com.db.entity;

import java.util.List;

public class Page {

    private int currentPage;

    private int pageSize;

    private int totalCount;

    private int pageCount;

    private List<Film> list;

    private String url;

    public Page() {
    }

    public Page(int currentPage, int pageSize, int totalCount, List<Film> list, String url) {
        this.currentPage = currentPage;
        this.pageSize = pageSize;
        this.totalCount = totalCount;
        this.list = list;
        this.url = url;
        this.pageCount = totalCount%pageSize == 0 ? totalCount/pageSize : totalCount/pageSize+1;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
        if (totalCount>0 && pageSize>0){
            this.pageCount = totalCount%pageSize == 0 ? totalCount/pageSize : totalCount/pageSize+1;
        }
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
        if (totalCount>0 && pageSize>0){
            this.pageCount = totalCount%pageSize == 0 ? totalCount/pageSize : totalCount/pageSize+1;
        }
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public List<Film> getList() {
        return list;
    }

    public void setList(List<Film> list) {
        this.list = list;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Page{" +
                "currentPage=" + currentPage +
                ", pageSize=" + pageSize +
                ", totalCount=" + totalCount +
                ", pageCount=" + pageCount +
                ", list=" + list +
                ", url='" + url + '\'' +
                '}';
    }
}
