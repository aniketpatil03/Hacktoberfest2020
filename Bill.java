public class Bill {
		private int Billno;
		private double total;
		private double finaltotal;
		private double gst;
		
		public Bill(int billno, double total, double finaltotal, double gst) {
			this.Billno = billno;
			this.total = total;
			this.finaltotal = finaltotal;
			this.gst = gst;
		}

		public int getBillno() {
			return Billno;
		}

		public double getTotal() {
			return total;
		}

		public double getFinaltotal() {
			return finaltotal;
		}

		public double getGst() {
			return gst;
		}		
}