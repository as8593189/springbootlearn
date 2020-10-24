package com.pojo;

public class User {
		private int uid;
		private String uname;
		private int uage;
		public User(int uid, String uname, int uage) {
			super();
			this.uid = uid;
			this.uname = uname;
			this.uage = uage;
		}
		public User() {
			super();
		}
		public int getUid() {
			return uid;
		}
		public void setUid(int uid) {
			this.uid = uid;
		}
		public String getUname() {
			return uname;
		}
		public void setUname(String uname) {
			this.uname = uname;
		}
		public int getUage() {
			return uage;
		}
		public void setUage(int uage) {
			this.uage = uage;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + uage;
			result = prime * result + uid;
			result = prime * result + ((uname == null) ? 0 : uname.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			User other = (User) obj;
			if (uage != other.uage)
				return false;
			if (uid != other.uid)
				return false;
			if (uname == null) {
				if (other.uname != null)
					return false;
			} else if (!uname.equals(other.uname))
				return false;
			return true;
		}
		@Override
		public String toString() {
			return "User [uid=" + uid + ", uname=" + uname + ", uage=" + uage + "]";
		}
		
}
