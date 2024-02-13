using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Xml;

namespace ConsoleApp3
{
    class Taxpayer
    {
        public int ID { get; set; }
        public string Supervision { get; set; }
        public string TaxNumber { get; set; }
        public string Note { get; set; }
    }

    class Program
    {
        static void Main(string[] args)
        {
            var listTaxpayers = new List<Taxpayer>();

            SautinSoft.PdfFocus f = new SautinSoft.PdfFocus();

            f.OpenPdf(@"");

            var countPagePDF = f.PageCount;
            
            for (int i = 1; i <= countPagePDF; i++)
            {
                f.ToXml(@"",i,i);
                string xmlFilePath = @"";

                using (XmlReader reader = XmlReader.Create(xmlFilePath))
                {
                    while (reader.ReadToFollowing("row"))
                    {
                        Taxpayer taxpayer = new Taxpayer();
                        reader.ReadToFollowing("cell");
                        string isNum = reader.ReadElementContentAsString();
                        if (isNum != "№")
                        {
                            taxpayer.ID =int.Parse(isNum);
                       
                            reader.ReadToFollowing("cell");
                            taxpayer.Supervision = reader.ReadElementContentAsString();

                            reader.ReadToFollowing("cell");
                            taxpayer.TaxNumber = reader.ReadElementContentAsString();

                            reader.ReadToFollowing("cell");
                            taxpayer.Note = reader.ReadElementContentAsString();
                            
                            listTaxpayers.Add(taxpayer);
                        }

                    }
                }

                File.Delete(xmlFilePath);
            }

            var tax = listTaxpayers.FirstOrDefault(x => x.ID == 1);

            Console.WriteLine(tax.ID + " " + tax.Supervision + " " + tax.TaxNumber + " " + tax.Note);

            Console.WriteLine("listTaxpayersҚ = " + listTaxpayers.Count);

        }
    }

}