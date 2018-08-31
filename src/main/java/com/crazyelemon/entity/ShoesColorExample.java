package com.crazyelemon.entity;

import java.util.ArrayList;
import java.util.List;

public class ShoesColorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShoesColorExample() {
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

        public Criteria andShoesColorNameIsNull() {
            addCriterion("shoes_color_name is null");
            return (Criteria) this;
        }

        public Criteria andShoesColorNameIsNotNull() {
            addCriterion("shoes_color_name is not null");
            return (Criteria) this;
        }

        public Criteria andShoesColorNameEqualTo(String value) {
            addCriterion("shoes_color_name =", value, "shoesColorName");
            return (Criteria) this;
        }

        public Criteria andShoesColorNameNotEqualTo(String value) {
            addCriterion("shoes_color_name <>", value, "shoesColorName");
            return (Criteria) this;
        }

        public Criteria andShoesColorNameGreaterThan(String value) {
            addCriterion("shoes_color_name >", value, "shoesColorName");
            return (Criteria) this;
        }

        public Criteria andShoesColorNameGreaterThanOrEqualTo(String value) {
            addCriterion("shoes_color_name >=", value, "shoesColorName");
            return (Criteria) this;
        }

        public Criteria andShoesColorNameLessThan(String value) {
            addCriterion("shoes_color_name <", value, "shoesColorName");
            return (Criteria) this;
        }

        public Criteria andShoesColorNameLessThanOrEqualTo(String value) {
            addCriterion("shoes_color_name <=", value, "shoesColorName");
            return (Criteria) this;
        }

        public Criteria andShoesColorNameLike(String value) {
            addCriterion("shoes_color_name like", value, "shoesColorName");
            return (Criteria) this;
        }

        public Criteria andShoesColorNameNotLike(String value) {
            addCriterion("shoes_color_name not like", value, "shoesColorName");
            return (Criteria) this;
        }

        public Criteria andShoesColorNameIn(List<String> values) {
            addCriterion("shoes_color_name in", values, "shoesColorName");
            return (Criteria) this;
        }

        public Criteria andShoesColorNameNotIn(List<String> values) {
            addCriterion("shoes_color_name not in", values, "shoesColorName");
            return (Criteria) this;
        }

        public Criteria andShoesColorNameBetween(String value1, String value2) {
            addCriterion("shoes_color_name between", value1, value2, "shoesColorName");
            return (Criteria) this;
        }

        public Criteria andShoesColorNameNotBetween(String value1, String value2) {
            addCriterion("shoes_color_name not between", value1, value2, "shoesColorName");
            return (Criteria) this;
        }

        public Criteria andShoesColorStatusIsNull() {
            addCriterion("shoes_color_status is null");
            return (Criteria) this;
        }

        public Criteria andShoesColorStatusIsNotNull() {
            addCriterion("shoes_color_status is not null");
            return (Criteria) this;
        }

        public Criteria andShoesColorStatusEqualTo(Boolean value) {
            addCriterion("shoes_color_status =", value, "shoesColorStatus");
            return (Criteria) this;
        }

        public Criteria andShoesColorStatusNotEqualTo(Boolean value) {
            addCriterion("shoes_color_status <>", value, "shoesColorStatus");
            return (Criteria) this;
        }

        public Criteria andShoesColorStatusGreaterThan(Boolean value) {
            addCriterion("shoes_color_status >", value, "shoesColorStatus");
            return (Criteria) this;
        }

        public Criteria andShoesColorStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("shoes_color_status >=", value, "shoesColorStatus");
            return (Criteria) this;
        }

        public Criteria andShoesColorStatusLessThan(Boolean value) {
            addCriterion("shoes_color_status <", value, "shoesColorStatus");
            return (Criteria) this;
        }

        public Criteria andShoesColorStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("shoes_color_status <=", value, "shoesColorStatus");
            return (Criteria) this;
        }

        public Criteria andShoesColorStatusIn(List<Boolean> values) {
            addCriterion("shoes_color_status in", values, "shoesColorStatus");
            return (Criteria) this;
        }

        public Criteria andShoesColorStatusNotIn(List<Boolean> values) {
            addCriterion("shoes_color_status not in", values, "shoesColorStatus");
            return (Criteria) this;
        }

        public Criteria andShoesColorStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("shoes_color_status between", value1, value2, "shoesColorStatus");
            return (Criteria) this;
        }

        public Criteria andShoesColorStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("shoes_color_status not between", value1, value2, "shoesColorStatus");
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