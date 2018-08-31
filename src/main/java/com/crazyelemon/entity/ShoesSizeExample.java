package com.crazyelemon.entity;

import java.util.ArrayList;
import java.util.List;

public class ShoesSizeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShoesSizeExample() {
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

        public Criteria andShoesSizeIsNull() {
            addCriterion("shoes_size is null");
            return (Criteria) this;
        }

        public Criteria andShoesSizeIsNotNull() {
            addCriterion("shoes_size is not null");
            return (Criteria) this;
        }

        public Criteria andShoesSizeEqualTo(Float value) {
            addCriterion("shoes_size =", value, "shoesSize");
            return (Criteria) this;
        }

        public Criteria andShoesSizeNotEqualTo(Float value) {
            addCriterion("shoes_size <>", value, "shoesSize");
            return (Criteria) this;
        }

        public Criteria andShoesSizeGreaterThan(Float value) {
            addCriterion("shoes_size >", value, "shoesSize");
            return (Criteria) this;
        }

        public Criteria andShoesSizeGreaterThanOrEqualTo(Float value) {
            addCriterion("shoes_size >=", value, "shoesSize");
            return (Criteria) this;
        }

        public Criteria andShoesSizeLessThan(Float value) {
            addCriterion("shoes_size <", value, "shoesSize");
            return (Criteria) this;
        }

        public Criteria andShoesSizeLessThanOrEqualTo(Float value) {
            addCriterion("shoes_size <=", value, "shoesSize");
            return (Criteria) this;
        }

        public Criteria andShoesSizeIn(List<Float> values) {
            addCriterion("shoes_size in", values, "shoesSize");
            return (Criteria) this;
        }

        public Criteria andShoesSizeNotIn(List<Float> values) {
            addCriterion("shoes_size not in", values, "shoesSize");
            return (Criteria) this;
        }

        public Criteria andShoesSizeBetween(Float value1, Float value2) {
            addCriterion("shoes_size between", value1, value2, "shoesSize");
            return (Criteria) this;
        }

        public Criteria andShoesSizeNotBetween(Float value1, Float value2) {
            addCriterion("shoes_size not between", value1, value2, "shoesSize");
            return (Criteria) this;
        }

        public Criteria andShoesStateIsNull() {
            addCriterion("shoes_state is null");
            return (Criteria) this;
        }

        public Criteria andShoesStateIsNotNull() {
            addCriterion("shoes_state is not null");
            return (Criteria) this;
        }

        public Criteria andShoesStateEqualTo(Boolean value) {
            addCriterion("shoes_state =", value, "shoesState");
            return (Criteria) this;
        }

        public Criteria andShoesStateNotEqualTo(Boolean value) {
            addCriterion("shoes_state <>", value, "shoesState");
            return (Criteria) this;
        }

        public Criteria andShoesStateGreaterThan(Boolean value) {
            addCriterion("shoes_state >", value, "shoesState");
            return (Criteria) this;
        }

        public Criteria andShoesStateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("shoes_state >=", value, "shoesState");
            return (Criteria) this;
        }

        public Criteria andShoesStateLessThan(Boolean value) {
            addCriterion("shoes_state <", value, "shoesState");
            return (Criteria) this;
        }

        public Criteria andShoesStateLessThanOrEqualTo(Boolean value) {
            addCriterion("shoes_state <=", value, "shoesState");
            return (Criteria) this;
        }

        public Criteria andShoesStateIn(List<Boolean> values) {
            addCriterion("shoes_state in", values, "shoesState");
            return (Criteria) this;
        }

        public Criteria andShoesStateNotIn(List<Boolean> values) {
            addCriterion("shoes_state not in", values, "shoesState");
            return (Criteria) this;
        }

        public Criteria andShoesStateBetween(Boolean value1, Boolean value2) {
            addCriterion("shoes_state between", value1, value2, "shoesState");
            return (Criteria) this;
        }

        public Criteria andShoesStateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("shoes_state not between", value1, value2, "shoesState");
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