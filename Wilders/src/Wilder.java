class Wilder {
	// Attributs
		private String firstName;
		private boolean aware;

		// Méthodes
		public String whoAmI() {
			String state = "My name is " + firstName;
			if (this.aware) {
				state += " and I'm aware";
			}
			else {
				state += " and I'm not aware";
			}
			return state;
		}
		
		
		public Wilder(String firstName,boolean aware) {
			this.firstName = firstName;
			this.aware = aware;
		}
		
		public String getfirstName() {
			return this.firstName;
		}

		public void setfirstName(String firstName) {
			this.firstName = firstName;
		}
		
		public boolean getAware() {
			return this.aware;
		}


		public void setAware(boolean aware) {
			this.aware = aware;
		}
		
}
