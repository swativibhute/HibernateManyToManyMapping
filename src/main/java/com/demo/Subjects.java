package com.demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Subjects")

public class Subjects {

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="s_id")
		private int id;
		private String sub_name;
		private String sub_Code;
		
		@ManyToMany(mappedBy="subjects")
		private List<Teacher> teachers = new ArrayList<Teacher>();
		
		

		public Subjects() {
			super();
			// TODO Auto-generated constructor stub
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getSub_name() {
			return sub_name;
		}

		public void setSub_name(String sub_name) {
			this.sub_name = sub_name;
		}

		public String getSub_Code() {
			return sub_Code;
		}

		public void setSub_Code(String sub_Code) {
			this.sub_Code = sub_Code;
		}

		public List<Teacher> getTeachers() {
			return teachers;
		}

		public void setTeachers(List<Teacher> teachers) {
			this.teachers = teachers;
		}
		
}
