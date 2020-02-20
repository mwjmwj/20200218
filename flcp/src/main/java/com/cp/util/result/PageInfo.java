package com.cp.util.result;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "分页信息")
public class PageInfo {
    /**
     * 当前页
     */
    @ApiModelProperty(value = "当前页")
    private int pageNum;
    /**
     * 每页的数量
     */
    @ApiModelProperty(value = "每页的数量")
    private int pageSize;
    /**
     * 当前页的数量
     */
    @ApiModelProperty(value = "当前页的数量")
    private int size;
    //由于startRow和endRow不常用，这里说个具体的用法
    //可以在页面中"显示startRow到endRow 共size条数据"
    /**
     * 当前页面第一个元素在数据库中的行号
     */
    @ApiModelProperty(value = "当前页面第一个元素在数据库中的行号")
    private int startRow;
    /**
     * 当前页面最后一个元素在数据库中的行号
     */
    @ApiModelProperty(value = "当前页面最后一个元素在数据库中的行号")
    private int endRow;
    /**
     * 总记录数
     */
    @ApiModelProperty(value = "总记录数")
    private long total;
    /**
     * 总页数
     */
    @ApiModelProperty(value = "总页数")
    private int pages;

    /**
     * 前一页
     */
    @ApiModelProperty(value = "前一页")
    private int prePage;

    /**
     * 下一页
     */
    @ApiModelProperty(value = "下一页")
    private int nextPage;
    /**
     * 导航页码数
     */
    @ApiModelProperty(value = "导航页码数")
    private int navigatePages;
    /**
     * 所有导航页号
     */
    @ApiModelProperty(value = "所有导航页号")
    private int[] navigatepageNums;
    /**
     * 导航条上的第一页
     */
    @ApiModelProperty(value = "导航条上的第一页")
    private int navigateFirstPage;
    /**
     * 导航条上的最后一页
     */
    @ApiModelProperty(value = "导航条上的最后一页")
    private int navigateLastPage;

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getStartRow() {
        return startRow;
    }

    public void setStartRow(int startRow) {
        this.startRow = startRow;
    }

    public int getEndRow() {
        return endRow;
    }

    public void setEndRow(int endRow) {
        this.endRow = endRow;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPrePage() {
        return prePage;
    }

    public void setPrePage(int prePage) {
        this.prePage = prePage;
    }

    public int getNextPage() {
        return nextPage;
    }

    public void setNextPage(int nextPage) {
        this.nextPage = nextPage;
    }

    public int getNavigatePages() {
        return navigatePages;
    }

    public void setNavigatePages(int navigatePages) {
        this.navigatePages = navigatePages;
    }

    public int[] getNavigatepageNums() {
        return navigatepageNums;
    }

    public void setNavigatepageNums(int[] navigatepageNums) {
        this.navigatepageNums = navigatepageNums;
    }

    public int getNavigateFirstPage() {
        return navigateFirstPage;
    }

    public void setNavigateFirstPage(int navigateFirstPage) {
        this.navigateFirstPage = navigateFirstPage;
    }

    public int getNavigateLastPage() {
        return navigateLastPage;
    }

    public void setNavigateLastPage(int navigateLastPage) {
        this.navigateLastPage = navigateLastPage;
    }
}
