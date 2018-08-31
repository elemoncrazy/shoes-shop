package com.crazyelemon.entity;

import java.util.ArrayList;
import java.util.List;

public class ShoesDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShoesDetailExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andShoesDetailIdIsNull() {
            addCriterion("shoes_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andShoesDetailIdIsNotNull() {
            addCriterion("shoes_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andShoesDetailIdEqualTo(Integer value) {
            addCriterion("shoes_detail_id =", value, "shoesDetailId");
            return (Criteria) this;
        }

        public Criteria andShoesDetailIdNotEqualTo(Integer value) {
            addCriterion("shoes_detail_id <>", value, "shoesDetailId");
            return (Criteria) this;
        }

        public Criteria andShoesDetailIdGreaterThan(Integer value) {
            addCriterion("shoes_detail_id >", value, "shoesDetailId");
            return (Criteria) this;
        }

        public Criteria andShoesDetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shoes_detail_id >=", value, "shoesDetailId");
            return (Criteria) this;
        }

        public Criteria andShoesDetailIdLessThan(Integer value) {
            addCriterion("shoes_detail_id <", value, "shoesDetailId");
            return (Criteria) this;
        }

        public Criteria andShoesDetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("shoes_detail_id <=", value, "shoesDetailId");
            return (Criteria) this;
        }

        public Criteria andShoesDetailIdIn(List<Integer> values) {
            addCriterion("shoes_detail_id in", values, "shoesDetailId");
            return (Criteria) this;
        }

        public Criteria andShoesDetailIdNotIn(List<Integer> values) {
            addCriterion("shoes_detail_id not in", values, "shoesDetailId");
            return (Criteria) this;
        }

        public Criteria andShoesDetailIdBetween(Integer value1, Integer value2) {
            addCriterion("shoes_detail_id between", value1, value2, "shoesDetailId");
            return (Criteria) this;
        }

        public Criteria andShoesDetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shoes_detail_id not between", value1, value2, "shoesDetailId");
            return (Criteria) this;
        }

        public Criteria andShoesIdIsNull() {
            addCriterion("shoes_id is null");
            return (Criteria) this;
        }

        public Criteria andShoesIdIsNotNull() {
            addCriterion("shoes_id is not null");
            return (Criteria) this;
        }

        public Criteria andShoesIdEqualTo(Integer value) {
            addCriterion("shoes_id =", value, "shoesId");
            return (Criteria) this;
        }

        public Criteria andShoesIdNotEqualTo(Integer value) {
            addCriterion("shoes_id <>", value, "shoesId");
            return (Criteria) this;
        }

        public Criteria andShoesIdGreaterThan(Integer value) {
            addCriterion("shoes_id >", value, "shoesId");
            return (Criteria) this;
        }

        public Criteria andShoesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shoes_id >=", value, "shoesId");
            return (Criteria) this;
        }

        public Criteria andShoesIdLessThan(Integer value) {
            addCriterion("shoes_id <", value, "shoesId");
            return (Criteria) this;
        }

        public Criteria andShoesIdLessThanOrEqualTo(Integer value) {
            addCriterion("shoes_id <=", value, "shoesId");
            return (Criteria) this;
        }

        public Criteria andShoesIdIn(List<Integer> values) {
            addCriterion("shoes_id in", values, "shoesId");
            return (Criteria) this;
        }

        public Criteria andShoesIdNotIn(List<Integer> values) {
            addCriterion("shoes_id not in", values, "shoesId");
            return (Criteria) this;
        }

        public Criteria andShoesIdBetween(Integer value1, Integer value2) {
            addCriterion("shoes_id between", value1, value2, "shoesId");
            return (Criteria) this;
        }

        public Criteria andShoesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shoes_id not between", value1, value2, "shoesId");
            return (Criteria) this;
        }

        public Criteria andShoesColorIdIsNull() {
            addCriterion("shoes_color_id is null");
            return (Criteria) this;
        }

        public Criteria andShoesColorIdIsNotNull() {
            addCriterion("shoes_color_id is not null");
            return (Criteria) this;
        }

        public Criteria andShoesColorIdEqualTo(Integer value) {
            addCriterion("shoes_color_id =", value, "shoesColorId");
            return (Criteria) this;
        }

        public Criteria andShoesColorIdNotEqualTo(Integer value) {
            addCriterion("shoes_color_id <>", value, "shoesColorId");
            return (Criteria) this;
        }

        public Criteria andShoesColorIdGreaterThan(Integer value) {
            addCriterion("shoes_color_id >", value, "shoesColorId");
            return (Criteria) this;
        }

        public Criteria andShoesColorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shoes_color_id >=", value, "shoesColorId");
            return (Criteria) this;
        }

        public Criteria andShoesColorIdLessThan(Integer value) {
            addCriterion("shoes_color_id <", value, "shoesColorId");
            return (Criteria) this;
        }

        public Criteria andShoesColorIdLessThanOrEqualTo(Integer value) {
            addCriterion("shoes_color_id <=", value, "shoesColorId");
            return (Criteria) this;
        }

        public Criteria andShoesColorIdIn(List<Integer> values) {
            addCriterion("shoes_color_id in", values, "shoesColorId");
            return (Criteria) this;
        }

        public Criteria andShoesColorIdNotIn(List<Integer> values) {
            addCriterion("shoes_color_id not in", values, "shoesColorId");
            return (Criteria) this;
        }

        public Criteria andShoesColorIdBetween(Integer value1, Integer value2) {
            addCriterion("shoes_color_id between", value1, value2, "shoesColorId");
            return (Criteria) this;
        }

        public Criteria andShoesColorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shoes_color_id not between", value1, value2, "shoesColorId");
            return (Criteria) this;
        }

        public Criteria andShoesSizeIdIsNull() {
            addCriterion("shoes_size_id is null");
            return (Criteria) this;
        }

        public Criteria andShoesSizeIdIsNotNull() {
            addCriterion("shoes_size_id is not null");
            return (Criteria) this;
        }

        public Criteria andShoesSizeIdEqualTo(Integer value) {
            addCriterion("shoes_size_id =", value, "shoesSizeId");
            return (Criteria) this;
        }

        public Criteria andShoesSizeIdNotEqualTo(Integer value) {
            addCriterion("shoes_size_id <>", value, "shoesSizeId");
            return (Criteria) this;
        }

        public Criteria andShoesSizeIdGreaterThan(Integer value) {
            addCriterion("shoes_size_id >", value, "shoesSizeId");
            return (Criteria) this;
        }

        public Criteria andShoesSizeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shoes_size_id >=", value, "shoesSizeId");
            return (Criteria) this;
        }

        public Criteria andShoesSizeIdLessThan(Integer value) {
            addCriterion("shoes_size_id <", value, "shoesSizeId");
            return (Criteria) this;
        }

        public Criteria andShoesSizeIdLessThanOrEqualTo(Integer value) {
            addCriterion("shoes_size_id <=", value, "shoesSizeId");
            return (Criteria) this;
        }

        public Criteria andShoesSizeIdIn(List<Integer> values) {
            addCriterion("shoes_size_id in", values, "shoesSizeId");
            return (Criteria) this;
        }

        public Criteria andShoesSizeIdNotIn(List<Integer> values) {
            addCriterion("shoes_size_id not in", values, "shoesSizeId");
            return (Criteria) this;
        }

        public Criteria andShoesSizeIdBetween(Integer value1, Integer value2) {
            addCriterion("shoes_size_id between", value1, value2, "shoesSizeId");
            return (Criteria) this;
        }

        public Criteria andShoesSizeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shoes_size_id not between", value1, value2, "shoesSizeId");
            return (Criteria) this;
        }

        public Criteria andShoesInventoryIsNull() {
            addCriterion("shoes_inventory is null");
            return (Criteria) this;
        }

        public Criteria andShoesInventoryIsNotNull() {
            addCriterion("shoes_inventory is not null");
            return (Criteria) this;
        }

        public Criteria andShoesInventoryEqualTo(Integer value) {
            addCriterion("shoes_inventory =", value, "shoesInventory");
            return (Criteria) this;
        }

        public Criteria andShoesInventoryNotEqualTo(Integer value) {
            addCriterion("shoes_inventory <>", value, "shoesInventory");
            return (Criteria) this;
        }

        public Criteria andShoesInventoryGreaterThan(Integer value) {
            addCriterion("shoes_inventory >", value, "shoesInventory");
            return (Criteria) this;
        }

        public Criteria andShoesInventoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("shoes_inventory >=", value, "shoesInventory");
            return (Criteria) this;
        }

        public Criteria andShoesInventoryLessThan(Integer value) {
            addCriterion("shoes_inventory <", value, "shoesInventory");
            return (Criteria) this;
        }

        public Criteria andShoesInventoryLessThanOrEqualTo(Integer value) {
            addCriterion("shoes_inventory <=", value, "shoesInventory");
            return (Criteria) this;
        }

        public Criteria andShoesInventoryIn(List<Integer> values) {
            addCriterion("shoes_inventory in", values, "shoesInventory");
            return (Criteria) this;
        }

        public Criteria andShoesInventoryNotIn(List<Integer> values) {
            addCriterion("shoes_inventory not in", values, "shoesInventory");
            return (Criteria) this;
        }

        public Criteria andShoesInventoryBetween(Integer value1, Integer value2) {
            addCriterion("shoes_inventory between", value1, value2, "shoesInventory");
            return (Criteria) this;
        }

        public Criteria andShoesInventoryNotBetween(Integer value1, Integer value2) {
            addCriterion("shoes_inventory not between", value1, value2, "shoesInventory");
            return (Criteria) this;
        }

        public Criteria andShoesSaleCountIsNull() {
            addCriterion("shoes_sale_count is null");
            return (Criteria) this;
        }

        public Criteria andShoesSaleCountIsNotNull() {
            addCriterion("shoes_sale_count is not null");
            return (Criteria) this;
        }

        public Criteria andShoesSaleCountEqualTo(Integer value) {
            addCriterion("shoes_sale_count =", value, "shoesSaleCount");
            return (Criteria) this;
        }

        public Criteria andShoesSaleCountNotEqualTo(Integer value) {
            addCriterion("shoes_sale_count <>", value, "shoesSaleCount");
            return (Criteria) this;
        }

        public Criteria andShoesSaleCountGreaterThan(Integer value) {
            addCriterion("shoes_sale_count >", value, "shoesSaleCount");
            return (Criteria) this;
        }

        public Criteria andShoesSaleCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("shoes_sale_count >=", value, "shoesSaleCount");
            return (Criteria) this;
        }

        public Criteria andShoesSaleCountLessThan(Integer value) {
            addCriterion("shoes_sale_count <", value, "shoesSaleCount");
            return (Criteria) this;
        }

        public Criteria andShoesSaleCountLessThanOrEqualTo(Integer value) {
            addCriterion("shoes_sale_count <=", value, "shoesSaleCount");
            return (Criteria) this;
        }

        public Criteria andShoesSaleCountIn(List<Integer> values) {
            addCriterion("shoes_sale_count in", values, "shoesSaleCount");
            return (Criteria) this;
        }

        public Criteria andShoesSaleCountNotIn(List<Integer> values) {
            addCriterion("shoes_sale_count not in", values, "shoesSaleCount");
            return (Criteria) this;
        }

        public Criteria andShoesSaleCountBetween(Integer value1, Integer value2) {
            addCriterion("shoes_sale_count between", value1, value2, "shoesSaleCount");
            return (Criteria) this;
        }

        public Criteria andShoesSaleCountNotBetween(Integer value1, Integer value2) {
            addCriterion("shoes_sale_count not between", value1, value2, "shoesSaleCount");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("`status` not between", value1, value2, "status");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}